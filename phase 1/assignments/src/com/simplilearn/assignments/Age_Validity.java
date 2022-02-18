package com.simplilearn.assignments;

import java.util.Scanner;

public class Age_Validity {
	public static void main(String[] args) {
		Scanner n= new Scanner(System.in);
		System.out.println("age: ");
		int m=n.nextInt();
		if(m>=18) {
			System.out.println("eligible for vote");
		}
		else {
			System.out.println("not elegible");
		}
		n.close();
	}

}
