package com.simplilearn.innerclass;

import java.util.Scanner;

public class InnerClass {
	void validate(int age) {
		if(age>=18)
		{
			class Inner{
				void test() {
					System.out.println("eligible");
				}
			}
			Inner i=new Inner();
			i.test();
		}
		else {
			System.out.println("not eligible");
		}
	}
	public static void main(String[] args) {
		InnerClass local=new InnerClass();
		local.validate(19);
	}

}
