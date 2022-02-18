package com.simplilearn.projects;

import java.util.Scanner;

public class Calculater {
	public static void main(String[] args) {
		
		Scanner i=new Scanner(System.in);
		System.out.println("enter two numbers: ");
		double n1=i.nextDouble();
		double n2=i.nextDouble();
		double r;
		System.out.println("select op");
		char op=i.next().charAt(0);
		switch (op) {
		case'+':
			r=n1+n2;
			System.out.println(n1+"+"+n2+"="+r);
			break;
		case'-':
			r=n1-n2;
			System.out.println(n1+"-"+n2+"="+r);
			break;
		case'*':
			r=n1*n2;
			System.out.println(n1+"*"+n2+"="+r);
			break;
		case'/':
			r=n1/n2;
			System.out.println(n1+"/"+n2+"="+r);
			break;
		default:
			System.out.println("invalid  op");
			break;
		}
		
		
	}
}
