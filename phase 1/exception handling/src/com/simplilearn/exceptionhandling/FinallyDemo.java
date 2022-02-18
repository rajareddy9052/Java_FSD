package com.simplilearn.exceptionhandling;

import java.net.Inet4Address;
import java.util.Scanner;

public class FinallyDemo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		try {
			System.out.println("enter num");
			String st=s.nextLine();
			int num=Integer.parseInt(st);
			System.out.println("enter name");
			String name=s.nextLine();
			System.out.println("id "+num+" name "+name);
			
		}
		catch (NumberFormatException e)
		{
			System.out.println(e);
		}
		finally
		{
			s.close();
			System.out.println("scanner closed");
		}
	}

}
