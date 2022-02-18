package com.simplilearn.exceptionhandling;

import javax.naming.InvalidNameException;

public class MyException extends Exception {
	static String s1;
	MyException(String s2)
	{
		s1=s2;
	}
	public String toString() {
		return("MyException "+s1);
	}
	public static void main(String[] args) throws InvalidNameException {
		MyException m=new MyException(null);
		throw new InvalidNameException("not valid"+s1);
		
				
	}
}
