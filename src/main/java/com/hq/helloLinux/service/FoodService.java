package com.hq.helloLinux.service;

import java.util.List;

import com.hq.helloLinux.entity.Food;

public interface FoodService {
	public void batchInsert(List<Food> foods);
	public List<Food> selectByDailyId(Long dailyId);
}
