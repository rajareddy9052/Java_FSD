package com.simplilearn.array;

import java.util.Scanner;

public class MultiDimentionArray {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int array[][]=new int [3][3];
		for(int i=0;i<3;i++) {
			for(int col=0;col<3;col++) {
				System.out.println("enter elements");
				array[i][col]=s.nextInt();
			}
		}
		System.out.println("matrix");
		for(int i=0;i<3;i++) {
			for(int col=0;col<3;col++) {
				System.out.print(array[i][col]+"\t");
				
			}
			System.out.println();
		}
		
	}
}