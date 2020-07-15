package com.hq.helloLinux.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hq.helloLinux.entity.Food;
import com.hq.helloLinux.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {
	@Autowired
	private FoodService foodService;
	
	@RequestMapping("/batchInsert")
	public void batchInsert(@RequestBody List<Food> foods) {
		foodService.batchInsert(foods);
	}
	
	@RequestMapping("/selectByDailyId/{dailyId}")
	public List<Food> selectByDailyId(@PathVariable Long dailyId){
		return foodService.selectByDailyId(dailyId);
	}
}
