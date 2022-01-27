package com.simplilearn.annoyinner;

public class AnnonymousTest {
	public static void main(String[] args) {
		Car c=new Car() {
			
			@Override
			public void stop() {
				System.out.println("car started");
				
			}
			
			@Override
			public void start() {
				System.out.println("car stop");
				
			}
		};
		c.start();
		c.stop();
	}

}
