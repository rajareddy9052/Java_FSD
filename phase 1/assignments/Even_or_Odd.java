package com.simplilearn.assignments;

import java.util.Scanner;

public class Even_or_Odd {
	public static void main(String[] args) {
		
		Scanner n= new Scanner(System.in);
		System.out.println("enter num:");
		int m=n.nextInt();
		if(m%2==0) {
			System.out.println(m+" is even");
		}
		else {
			System.out.println(m+" 5is odd");
		}
		
	}

}
