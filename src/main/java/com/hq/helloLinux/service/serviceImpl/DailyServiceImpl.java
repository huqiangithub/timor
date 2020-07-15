package com.hq.helloLinux.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hq.helloLinux.entity.Daily;
import com.hq.helloLinux.mapper.DailyMapper;
import com.hq.helloLinux.service.DailyService;

@Service
public class DailyServiceImpl implements DailyService{
	
	@Autowired
	private DailyMapper dailyMapper;
	
	@Autowired
	private DailyServiceImpl self;

	@Override
	public Daily selectById(Long id) {
		// TODO Auto-generated method stub
		selectTest();
		return dailyMapper.selectById(id);
	}
	
	public List<Daily> selectAll(){
		return dailyMapper.selectAll();
	}

	@Override
	public Long insert(Daily record) {
		// TODO Auto-generated method stub
		return dailyMapper.insert(record);
	}

	@Override
	public void update(Daily record) {
		// TODO Auto-generated method stub
		dailyMapper.update(record);
	}
	
	@Override
	public void selectTest() {
		System.out.println("....................................自注入测试...............................................！");
	}
}
