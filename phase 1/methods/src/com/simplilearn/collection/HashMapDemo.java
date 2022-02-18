package com.simplilearn.collection;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> l=new HashMap<Integer, String>();
		l.put(1, " minni");
		l.put(2," santhi");
		l.put(3, " raja");
		l.put(4, null);
		System.out.println(l);
		System.out.println(l);
		System.out.println(l.isEmpty());
		System.out.println(l.size());
		System.out.println(l.containsKey(2));
	}

}
