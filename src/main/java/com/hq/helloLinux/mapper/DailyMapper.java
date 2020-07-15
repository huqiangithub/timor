package com.hq.helloLinux.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hq.helloLinux.entity.Daily;

@Mapper
public interface DailyMapper {
	public Daily selectById(Long id);
	public List<Daily> selectAll();
	public Long insert(Daily record);
	public void update(Daily record);
}
