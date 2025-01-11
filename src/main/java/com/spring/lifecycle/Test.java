package com.spring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/spring/lifecycle/config.xml");
		// Registering shutdown hook...
		context.registerShutdownHook();
//		Samosa s1 = (Samosa) context.getBean("S1");
//		System.out.println(s1);
//
//		System.out.println("-------------------------------");
//		Pepsi p1 = (Pepsi) context.getBean("p1");
//		System.out.println(p1);
		
		Example e1=	(Example)context.getBean("e1");
		System.out.println(e1);
		
	}

}
