package com.simplilearn.array;

import java.util.Scanner;

public class SinglrDimension {
	public static void main(String[] args) {
		int array[]= {11,12,13,14,15};
		System.out.println(array[4]);
		for(int i=0;i<array.length;++i) {
			System.out.println(array[i]);
		}
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("num");
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	

}
