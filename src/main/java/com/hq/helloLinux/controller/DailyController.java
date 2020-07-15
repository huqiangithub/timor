package com.hq.helloLinux.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hq.helloLinux.config.controller.ResponseAdvisor;
import com.hq.helloLinux.entity.Daily;
import com.hq.helloLinux.service.DailyService;

@RestController
@RequestMapping("/daily")
public class DailyController {
	@Autowired
	private DailyService dailyService;
	
	@RequestMapping("/getById/{id}")
	@ResponseBody
	public Daily getById(@PathVariable Long id) {
		return dailyService.selectById(id);
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Daily> getAll() {
		return dailyService.selectAll();
	}
	
	@RequestMapping("/insert")
	public Long insert(@RequestBody Daily daily) {
		dailyService.insert(daily);
		return daily.getId();
	}
	
	@RequestMapping("/update")
	public void update(@RequestBody Daily daily) {
		dailyService.update(daily);
	}
}
