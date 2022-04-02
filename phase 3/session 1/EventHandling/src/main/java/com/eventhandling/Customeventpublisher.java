package com.eventhandling;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;

public class Customeventpublisher implements ApplicationEventPublisherAware {
	private ApplicationEventPublisher publisher;
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		
		this.publisher=publisher;
		
	}
	public void publish() {
		CustomEvent ce=new CustomEvent(this);
		publisher.publishEvent(ce);
	}

}
