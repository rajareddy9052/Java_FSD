package com.simplilearn.first;

import java.util.Scanner;

public class ConditionalStmt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st num");
		int a=sc.nextInt();
		System.out.println("enter 2nd num");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a+" is large num");
		}else {
			System.out.println(b+" is large num");
		}
		sc.close();
				
	}
	
	
}
