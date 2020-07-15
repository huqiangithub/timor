package com.hq.helloLinux.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hq.helloLinux.mapper.LookupMapper;
import com.hq.helloLinux.service.LookupService;

@Service
public class LookupServiceImpl implements LookupService{

	@Autowired
	LookupMapper mapper;
	
	@Override
	public String getDesp(String code,String groupCode) {
		// TODO Auto-generated method stub
		return mapper.getDesp(code, groupCode);
	}

}
