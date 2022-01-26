package com.simplilearn.collection;

import java.util.Vector;

public class Vectors {
	public static void main(String[] args) {
		Vector<String> l=new Vector<String>();
		l.add("LG");
		l.add("kia");
		l.add("MG");
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(2));
	}

}
