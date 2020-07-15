package com.hq.helloLinux.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LookupMapper {
	public String getDesp(String code,String groupCode);
}
