package com.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyInterceptor {

	@Before("execution(public void  MyServiceImpl.save())")
	public void before(){
		System.out.println("execute before intercepte");
	}
	
}
