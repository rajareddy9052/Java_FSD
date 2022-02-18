package com.simplilearn.thread;

public class Threaddemo extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName()+" started");
	}
	public static void main(String[] args) {
		Threaddemo t1=new Threaddemo();
		t1.start();
		t1.run();
		//t1.stop();
		Threaddemo t2=new Threaddemo();
		t2.start();
		t2.run();
		//t2.stop();
		
	}
	

}
