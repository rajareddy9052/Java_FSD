package com.simplilearn.innerclass;

public class RegularInner {
	public int a=10;
	class inner{
		void display()
		{
			System.out.println("welcome to inner class");
			System.out.println("a="+a);
		}
	}
	public static void main(String[] args) {
		RegularInner o=new RegularInner();
		RegularInner.inner in=o.new inner();
		in.display();
	}

}
