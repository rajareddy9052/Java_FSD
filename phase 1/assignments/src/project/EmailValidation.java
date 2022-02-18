package project;

import java.sql.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EmailValidation{
	public static void main(String[] args)throws InputMismatchException {
		ArrayList<String> s=new ArrayList<String>();
		
		s.add("raja@gmail.com");
		s.add("gopal@gmail.com");
		s.add("reddy@gmail.com");
		s.add("minni@gmail.com");
		Scanner r =new Scanner(System.in);
		System.out.println("enter mail");
		String tst=r.next();
		for(String i:s)
			if(tst.equals(i))
			{
				System.out.println("valid");
				//break;
			}
			else {
				System.out.println("not valid");
			break;	//break;
			}
			
		
	}

}
