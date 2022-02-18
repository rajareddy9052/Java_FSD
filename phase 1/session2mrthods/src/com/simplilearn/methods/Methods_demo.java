package com.simplilearn.methods;

import java.util.Scanner;

public class Methods_demo {
	public void display() {
		System.out.println("welcome");
	}
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	public boolean valid(int age) {
		if(age>18) {
			return true;
		}
		else {
			return false;
		}
	}
	public String fullname(String fnm, String lnm) {
		return fnm+" "+lnm;
	}
	public static void main(String[] args) {
		Methods_demo demo=new Methods_demo();
		demo.display();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nums");
		int n=sc.nextInt();
		int n1=sc.nextInt();
		int a=demo.add(n, n1);
		System.out.println(a);
		boolean c=demo.valid(20);
		System.out.println(c);
		String k=demo.fullname("rajagopal", "reddy");
		System.out.println(k);
		sc.close();
	}

}
