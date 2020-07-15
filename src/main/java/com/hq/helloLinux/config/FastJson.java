package com.hq.helloLinux.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.hq.helloLinux.config.serializer.LookupSerializeFilter;

// 有类继承WebMvcConfigurationSupport 则以下配置不会生效
//@Configuration
public class FastJson {

//	@Bean             
//	public HttpMessageConverters fastJsonMessageConverter() {
//
//		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
//	      //升级最新版本需加=============================================================
//	        List<MediaType> supportedMediaTypes = new ArrayList<>();
//	        supportedMediaTypes.add(MediaType.APPLICATION_JSON);
//	        supportedMediaTypes.add(MediaType.APPLICATION_JSON_UTF8);
//	        supportedMediaTypes.add(MediaType.APPLICATION_ATOM_XML);
//	        supportedMediaTypes.add(MediaType.APPLICATION_FORM_URLENCODED);
//	        supportedMediaTypes.add(MediaType.APPLICATION_OCTET_STREAM);
//	        supportedMediaTypes.add(MediaType.APPLICATION_PDF);
//	        supportedMediaTypes.add(MediaType.APPLICATION_RSS_XML);
//	        supportedMediaTypes.add(MediaType.APPLICATION_XHTML_XML);
//	        supportedMediaTypes.add(MediaType.APPLICATION_XML);
//	        supportedMediaTypes.add(MediaType.IMAGE_GIF);
//	        supportedMediaTypes.add(MediaType.IMAGE_JPEG);
//	        supportedMediaTypes.add(MediaType.IMAGE_PNG);
//	        supportedMediaTypes.add(MediaType.TEXT_EVENT_STREAM);
//	        supportedMediaTypes.add(MediaType.TEXT_HTML);
//	        supportedMediaTypes.add(MediaType.TEXT_MARKDOWN);
//	        supportedMediaTypes.add(MediaType.TEXT_PLAIN);
//	        supportedMediaTypes.add(MediaType.TEXT_XML);
//	        fastJsonHttpMessageConverter.setSupportedMediaTypes(supportedMediaTypes);
//	        //自定义配置...
//	        FastJsonConfig config = new FastJsonConfig();
//	        config.setSerializeFilters(new LookupSerializeFilter());
//	        config.setSerializerFeatures(SerializerFeature.QuoteFieldNames,
//	                SerializerFeature.WriteEnumUsingToString,
//	                /*SerializerFeature.WriteMapNullValue,*/
//	                SerializerFeature.WriteDateUseDateFormat,
//	                SerializerFeature.DisableCircularReferenceDetect);
//	        fastJsonHttpMessageConverter.setFastJsonConfig(config);
//		HttpMessageConverter<?> con =fastJsonHttpMessageConverter;
//		return new HttpMessageConverters(con);
//	}
}
