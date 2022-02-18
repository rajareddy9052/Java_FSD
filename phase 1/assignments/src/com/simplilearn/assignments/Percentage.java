package com.simplilearn.assignments;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		Scanner percentage= new Scanner(System.in);
		System.out.println("obtained %: ");
		float i= percentage.nextInt();
		if(i>=70 && i<=100) {
			System.out.println("distinction");
		}
		else if(i>=60 && i<=69){
			System.out.println("first class");
			
		}
		else if(i>=50 && i<=59) {
			System.out.println("second class");
		}
		else if (i>=35 && i<=49) {
			System.out.println("pass class");
		}
		else if(i>=0 && i<=34) {
			System.out.println("fail");
		}
	}

}
