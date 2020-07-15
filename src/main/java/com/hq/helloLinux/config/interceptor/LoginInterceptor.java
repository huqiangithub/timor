package com.hq.helloLinux.config.interceptor;

import java.io.PrintWriter;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.hq.helloLinux.entity.BaseResp;
import com.hq.helloLinux.util.RedisUtil;

public class LoginInterceptor implements HandlerInterceptor{
	
	@Resource
	private RedisUtil redisUtil;
	
	private static final Logger LOG = LoggerFactory.getLogger(LoginInterceptor.class);
	
//	public LoginInterceptor(RedisUtil redisUtil) {
//		// TODO Auto-generated constructor stub
//		this.redisUtil=redisUtil;
//	}
	
//	public LoginInterceptor() {
//		// TODO Auto-generated constructor stub
//	}
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();
		String userName = (String) session.getAttribute("userName");
		LOG.info("userName:"+userName);
		
		if(redisUtil.get("loginUser:"+session.getAttribute("userName"))==null) {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;charset=utf-8");
			PrintWriter writer=response.getWriter();
			BaseResp baseResp = new BaseResp();
			baseResp.setStatus(401);
			baseResp.setMessage("未登录");
//			Map<String, Object> map = new HashMap<String, Object>();
//			map.put("msg", "未登录");
//			map.put("status", 401);
//			baseResp.setBody(map);
			writer.write(JSONObject.toJSONString(baseResp));
			response.setStatus(401);
			return false;
		}else {
			return true;
		}
//		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
}
