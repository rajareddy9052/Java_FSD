package com.simplilearn.assignments;

import java.util.Scanner;

public class Division_five {
	public static void main(String[] args) {
		Scanner n= new Scanner(System.in);
		System.out.println("num: ");
		int m= n.nextInt();
		if(m%5==0) {
			System.out.println(m+" is divisible by 5");
		}
		else {
			System.out.println(m+" is not divisible by 5");
		}
	}

}
