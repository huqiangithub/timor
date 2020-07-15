package com.hq.helloLinux.config.serializer;

import java.io.IOException;
import java.lang.reflect.Type;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class LookupSerializer implements ObjectSerializer{
	
	public static final  LookupSerializer instance = new  LookupSerializer();

	@Override
	public void write(JSONSerializer serializer, Object object, Object fieldName, Type fieldType, int features)
			throws IOException {
		// TODO Auto-generated method stub
		SerializeWriter out = serializer.out;
		
		if (object == null) {
            out.writeNull();
            return;
        }
		
		//原来的值code
        String strVal = object.toString();
        System.out.println(strVal);
        //通过code查找相关名称，测试先写死值 
//        String name="std";
//        out.writeString(name);
        out.writeLong(1111);
	}

}
