package com.eventhandling;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
		
	}

	@Override
	public String toString() {
		return "CustomEvent [this is my custom event]";
	}
	

}
