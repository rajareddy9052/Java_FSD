package com.simplilearn.specifier;

public class AccessSpec {
	protected void dis() {
		System.out.println("protected");	
	}
	private void test() {
		System.out.println("private");
		
	}
	public void hello() {
		System.out.println("public");
		
	}
	void world() {
		System.out.println("def");
	}
	
	public static void main(String[] args) {
	
		AccessSpec obj=new AccessSpec();
		obj.dis();
		obj.test();
		obj.hello();
		obj.world();
		
}
}
