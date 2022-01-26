package com.simplilearn.collection;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet<String> l=new TreeSet<String>();
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
