package com.spring.aop;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext-aop.xml"); 
		Common c=(Common) factory.getBean("common");
		c.execute("userName_zhengjunhua","passWord_zhengjunhua");
	}

}
