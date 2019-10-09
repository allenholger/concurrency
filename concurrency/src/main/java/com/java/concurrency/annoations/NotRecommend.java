package com.java.concurrency.annoations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 该注解是课程里用来标记【不推荐】的注解
 * @author Administrator
 *
 */
//Target :注解作用的对象，本注解作用在类上
@Target(ElementType.TYPE)
//Retention: 注解作用的范围，本注解作用在源码上， 在源码编译后和编译码的运行中，该注解不会存在
@Retention(RetentionPolicy.SOURCE)
public @interface NotRecommend {
	String value() default "";
}
