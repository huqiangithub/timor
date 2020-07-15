package com.hq.helloLinux.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hq.helloLinux.entity.Food;
import com.hq.helloLinux.mapper.FoodMapper;
import com.hq.helloLinux.service.FoodService;

@Transactional
@Service
public class FoodServiceImpl implements FoodService {
	@Autowired
	private FoodMapper foodMapper;

	@Override
	public void batchInsert(List<Food> foods) {
		// TODO Auto-generated method stub
//		foodMapper.batchInsert(foods);
		foodMapper.deleteByDailyId(foods.get(0).getDailyid());
//		try {
//			foodMapper.deleteByDailyId(foods.get(0).getDailyid()); // try catch不会回滚
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("会回滚吗？？？");
//		}
		foodMapper.batchInsert(foods);
	}
	
	@Transactional(propagation=Propagation.NOT_SUPPORTED) // 不事务
	public List<Food> selectByDailyId(Long dailyId){
		return foodMapper.selectByDailyId(dailyId);
	}
}
