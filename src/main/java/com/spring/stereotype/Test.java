package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/stereotype/stereoconfig.xml");
		Student s1=con.getBean("student", Student.class);
		System.out.println(s1);
		System.out.println(s1.getAddress());
		System.out.println(s1.getAddress().getClass().getName());

	}

}
