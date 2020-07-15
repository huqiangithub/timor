package com.hq.helloLinux.config.serializer;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.ReflectionUtils.FieldCallback;

import com.alibaba.fastjson.serializer.AfterFilter;
import com.hq.helloLinux.annotation.Lookup;
import com.hq.helloLinux.service.DailyService;
import com.hq.helloLinux.service.LookupService;
import com.hq.helloLinux.service.serviceImpl.DailyServiceImpl;
import com.hq.helloLinux.service.serviceImpl.LookupServiceImpl;

@Configuration
public class LookupSerializeFilter extends AfterFilter{
	
	@Autowired
	LookupService service;

	@Override
	public void writeAfter(Object object) {
		// TODO Auto-generated method stub
		Class<?> clazz = object.getClass();
//		List<Field> fields = new ArrayList<Field>(6);
	    ReflectionUtils.doWithFields(clazz, new FieldCallback() {
	      public void doWith(Field field) throws IllegalArgumentException, IllegalAccessException {
	        if (AnnotationUtils.getAnnotation(field, Lookup.class) != null) {
	          ReflectionUtils.makeAccessible(field);
	          System.out.println(service.getDesp((String) field.get(object), field.getAnnotation(Lookup.class).type()));
	          writeKeyValue(field.getName()+"Desp", service.getDesp((String) field.get(object), field.getAnnotation(Lookup.class).type()));
//	          fields.add(field);
	        }
	      }
	    });
	}
}
