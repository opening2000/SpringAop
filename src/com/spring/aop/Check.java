package com.spring.aop;

import org.aspectj.lang.JoinPoint;

public class Check {

	public void checkValidity(){
		System.out.println("----------校验合法性----------");
	}
	
	public void addLog(JoinPoint j){
		System.out.println("----------添加日志----------");
		Object obj[] = j.getArgs();
		for(Object o:obj){
			System.out.println(o);
		}
		System.out.println("========checkSecurity=="+j.getSignature().getName());//这个方法是获得方法名
	}
}
