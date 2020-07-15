package com.hq.helloLinux.service;

import java.util.List;

import com.hq.helloLinux.entity.Daily;

public interface DailyService {
	public Daily selectById(Long id);
	public List<Daily> selectAll();
	public Long insert(Daily record);
	public void update(Daily record);
	public void selectTest();
}
