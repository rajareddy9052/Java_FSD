package com.simplilearn.methods;

import java.util.Scanner;

public class Method_Overloading {
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public float add(float a,float b)
	{
		return a+b;
	}
	public float add(float a,float b,float c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		Method_Overloading m=new Method_Overloading();
		Scanner s1=new Scanner(System.in);
		System.out.println("enter num");
		int a=s1.nextInt();
		int i2=s1.nextInt();
		int i3=s1.nextInt();
		//Scanner s2=new Scanner(System.in);
		//System.out.println("enter num");
		//int i2=s2.nextInt();
		//Scanner s3=new Scanner(System.in);
		//System.out.println("enter num");
		//int i3=s3.nextInt();
		System.out.println("1st "+m.add(a,i2));
		System.out.println("2nd "+m.add(a,i2,i3));
		Scanner s2=new Scanner(System.in);
		System.out.println("enter num");
		float f1=s2.nextFloat();
		float f2=s2.nextFloat();
		float f3=s2.nextFloat();
		
		System.out.println("3rd "+m.add(f1,f2));
		System.out.println("4th "+m.add(f1,f2,f3));
		s1.close();
		s2.close();
	}


}
