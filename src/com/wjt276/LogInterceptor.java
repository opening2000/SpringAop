package com.wjt276;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class LogInterceptor {

//	@Before("execution(public void  com.wjt276.dao.impl.UserDaoImpl.save(com.wjt276.model.User))")
	public void before() {
		System.out.println("method start...");
	}
}
