package com.hq.helloLinux.controller;

import java.lang.reflect.Array;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hq.helloLinux.entity.RedisKV;
import com.hq.helloLinux.util.RedisUtil;



@RestController
@RequestMapping("/redis")
public class RedisController {
	
	private final Long DEFAULT_EXPIRE_TIME=20L;
	
	@Resource
	private RedisUtil redisUtil;
	
	@RequestMapping(value="/set",method=RequestMethod.POST)
	public boolean redisSet(@RequestBody RedisKV kv) {
		
		if(kv.getExpireTime()!=null) {
			return redisUtil.set(kv.getKey(),kv.getValue(),kv.getExpireTime());
		}
		return redisUtil.set(kv.getKey(),kv.getValue(),DEFAULT_EXPIRE_TIME);
	}
	
	@RequestMapping("/get/{key}")
	public Object redisGet(@PathVariable String key) {
		return redisUtil.get(key);
	}
	
	@RequestMapping("/delete/{key}")
	public void redisDelete(@PathVariable String key) {
		redisUtil.del(key);
	}
}
