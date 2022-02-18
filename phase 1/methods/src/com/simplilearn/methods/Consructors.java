package com.simplilearn.methods;

public class Consructors {
	int id;
	String name;
	String dept;
	public Consructors() 
	{
		//System.out.println("hii sister");
		id=1;
		name="raja";
		dept="ece";
	}
	public Consructors(int id, String name,String dept) {
		this.id =id;
		this.name=name;
		this.dept=dept;
	}
	public static void main(String[] args) {
		Consructors c=new Consructors();
		//c.id=1;
		//c.name="raja";
		System.out.println("user 1");
		System.out.println("id:"+c.id);
		System.out.println("name "+c.name);
		System.out.println("dept "+c.dept);
		Consructors c2=new Consructors(2,"gopal","cse");
		System.out.println("user 2");
		System.out.println("id:"+c2.id);
		System.out.println("name "+c2.name);
		System.out.println("dept "+c2.dept);
		Consructors c3=new Consructors(3,"Rajagopal","mech");
		System.out.println("user 2");
		System.out.println("id:"+c3.id);
		System.out.println("name "+c3.name);
		System.out.println("dept "+c3.dept);
		
		
		
	}

}
