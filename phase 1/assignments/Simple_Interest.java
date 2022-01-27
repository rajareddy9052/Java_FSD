package com.simplilearn.assignments;

import java.util.Scanner;

public class Simple_Interest {
	public static void main(String[] args) {
		Scanner p1 = new Scanner(System.in);
        System.out.print("Enter principal: ");
        float p= p1.nextFloat();
        Scanner t1 = new Scanner(System.in);
        System.out.print("Enter rate: ");
        float t= t1.nextFloat();
        Scanner r1 = new Scanner(System.in);
        System.out.print("Enter time: ");
        float r= r1.nextFloat();
        float si = p * t * r  / 100; 
        //double p = in.nextDouble();
        //System.out.print("Enter rate: ");
        //double r = in.nextDouble();
       // System.out.print("Enter time: ");
      //  int t = in.nextInt();
      //  double si = p * r * t / 100;
        System.out.println("Simple Interest: " + si);
	}

}
