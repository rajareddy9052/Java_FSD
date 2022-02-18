package com.simplilearn.exceptionhandling;

public class ThrowDemo {
	void check(int age)
	{
		if(age<18) {
			throw new ArithmeticException("not valid");
			
		}
		else 
		{
			System.out.println("valid");
		}
	}
	public static void main(String[] args) {
		ThrowDemo c=new ThrowDemo();
		c.check(17);
	}

}
