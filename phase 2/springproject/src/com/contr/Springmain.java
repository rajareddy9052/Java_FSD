package com.contr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Employee;
import com.spring.Hello;

public class Springmain {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Hello h1=(Hello)context.getBean("h1");
		Hello h2=(Hello)context.getBean("h2");
		System.out.println(h1.getMessage());
		System.out.println(h2.getMessage());
		Employee e1=(Employee)context.getBean("e1");
		System.out.println(e1);
		Employee e2=(Employee)context.getBean("e2");
		System.out.println(e2);
		
	}

}
