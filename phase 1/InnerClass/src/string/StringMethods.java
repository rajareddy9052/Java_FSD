package string;

import java.util.Scanner;

public class StringMethods {
	public static void main(String[] args) {
		String s=new String("Hello World");
		System.out.println(s.indexOf("W"));
		System.out.println(s.length());
		Scanner sc =new Scanner(System.in);
		System.out.println("enter ur pwd");
		String pwd=sc.nextLine();
		if(s.equalsIgnoreCase(pwd))
			System.out.println("authenticated");
		else
			System.out.println("incorrect");
		
		
		
	}

}
