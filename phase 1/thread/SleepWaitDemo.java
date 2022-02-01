package com.simplilearn.thread;

import java.util.concurrent.locks.Lock;

public class SleepWaitDemo {
	private static final String Lock = null;
	public static Object lock= new Object();
	public static void main(String[] args) throws InterruptedException{
		Thread.sleep(1000);
		System.out.println("thread"+Thread.currentThread()+"sleeping of 1 sec");
		synchronized (lock) {
			Lock.wait(1000);
			System.out.println("object"+Lock+"is wake up of 1 sec");
			
		}
	}
}