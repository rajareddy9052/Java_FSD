package com.simplilearn.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> l=new LinkedHashSet<String>();
		l.add("minni");
		l.add("santhi");
		l.add("raja");
		l.add("nani");
		l.add("null");
		System.out.println(l);
		l.add("null");
		System.out.println(l);
		System.out.println(l.isEmpty());
		System.out.println(l.size());
	}

}
