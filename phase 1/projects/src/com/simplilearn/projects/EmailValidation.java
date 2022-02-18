package com.simplilearn.projects;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("raja@gmail.com");
		str.add("gopal@gmail.com");
		str.add("reddy@gmail.com");
		Scanner st=new Scanner(System.in);
		System.out.println("enter mail");
		String tst=st.next();
		for(String i:str)
			if(tst.equals(i))

		{
			System.out.println("valid");
			//break;
		}else {
			System.out.println("not valid");
		}
		
			
	}
}
