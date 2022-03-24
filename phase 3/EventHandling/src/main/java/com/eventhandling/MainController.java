package com.eventhandling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.ModelMap;

public class MainController {
	public String CustomEvent(ModelMap map) {
		String filename="main-servlet.xml";
		ApplicationContext context=new ClassPathXmlApplicationContext(filename);
		Customeventpublisher cep=(Customeventpublisher)context.getBean("cep");
		cep.publish();
		cep.publish();
		cep.publish();
		return "CustomEvent";
		
	}

}
