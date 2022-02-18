package com.simplilearn.innerclass;

public class MethodLocalInnerClass {
	public void display()
	{
		class Inner
		{
			void myMethod()
			{
				System.out.println("method from inner class");
			}
			
		}
		Inner in=new Inner();
		in.myMethod();
	}
	public static void main(String[] args) {
		MethodLocalInnerClass ou=new MethodLocalInnerClass();
		ou.display();
	}
	

}
