package com.DemoSpring;

public class Student {
	private String name;
	private Marks marks;
	
	public Student() {
		
	}
	public Student(String name, Marks marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	/**public Student(String name) {
		super();
		this.name = name;
	}**/
	
	public Marks getMarks() {
		return marks;
	}


	public void setMarks(Marks marks) {
		this.marks = marks;
	}


	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	

	/**@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}**/
	
	

}
