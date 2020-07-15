package com.hq.helloLinux.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hq.helloLinux.entity.Food;

@Mapper
public interface FoodMapper {
	public void batchInsert(List<Food> foods);
	public List<Food> selectByDailyId(Long dailyId);
	public void deleteByDailyId(Long dailyId);
}
