package com.simplilearn.thread;

public class Threaddemo2 implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"started");
		
	}
	public static void main(String[] args) {
		Threaddemo2 t1=new Threaddemo2();
		Thread t=new Thread(t1);
		t.start();
	}

}
