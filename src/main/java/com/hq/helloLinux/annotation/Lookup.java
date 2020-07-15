package com.hq.helloLinux.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

/**
 * lookup值转化注解
 * @author huqian
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.FIELD})
@Documented
public @interface Lookup {
	/**
	 * 分类
	 * @return
	 */
	String type();
}
