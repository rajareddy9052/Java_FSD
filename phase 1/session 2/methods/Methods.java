package com.simplilearn.methods;

import java.util.Scanner;

public class Methods {
	public void display() {
		System.out.println("hello");
	}
	public int result(int a, int b)
	{
		int c=a+b;
		int d=a*b;
		return c+d;
	}
	public boolean valid(int age)
	{
		if (age>18)
			return true;
		else
			return false;
	}
	public String fullName(String fname ,String lname)
	{
		return fname+lname;
	}
	public static void main(String[] args) {
		Methods s=new Methods();
		s.display();
		Scanner a=new Scanner(System.in);
		System.out.println("enter num");
		int input1=a.nextInt();
		Scanner b=new Scanner(System.in);
		System.out.println("enter num");
		int input2=b.nextInt();
		
		System.out.println("result "+s.result(input1, input2));
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age ");
		int input3 =sc.nextInt();
		if(s.valid(input3))
		{
			System.out.println("eligible");
		}
		else {
			System.out.println("not eligible");
		}
		System.out.println(s.valid(15));
		System.out.println("my full name is "+s.fullName("Rajagopal", " Reddy"));
	}

}
