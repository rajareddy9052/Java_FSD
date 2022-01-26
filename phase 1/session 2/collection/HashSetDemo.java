package com.simplilearn.collection;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> l=new HashSet<String>();
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
