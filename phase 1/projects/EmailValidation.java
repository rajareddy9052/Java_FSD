package com.simplilearn.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("raja@gmail.com");
		str.add("gopal@gmail.com");
		str.add("reddy@gmail.com");
		Scanner st=new Scanner(System.in);
		System.out.println("enter email");
		String str1=st.nextLine();
		for(String i:str)
		if(str.equals(str1))
		{
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
		
			
	}
}
