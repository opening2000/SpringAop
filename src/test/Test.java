package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.aop.annotation.MyServiceImpl;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext-aop.xml");
		MyServiceImpl impl = (MyServiceImpl)factory.getBean("myServiceImpl");
		impl.save();
	}

}
