package com.spring.aop;

import org.aspectj.lang.JoinPoint;

public class Check {

	public void checkValidity(){
		System.out.println("----------У��Ϸ���----------");
	}
	
	public void addLog(JoinPoint j){
		System.out.println("----------�����־----------");
		Object obj[] = j.getArgs();
		for(Object o:obj){
			System.out.println(o);
		}
		System.out.println("========checkSecurity=="+j.getSignature().getName());//��������ǻ�÷�����
	}
}
