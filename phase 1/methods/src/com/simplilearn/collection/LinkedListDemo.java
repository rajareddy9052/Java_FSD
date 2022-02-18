package com.simplilearn.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.println("size "+l.size());
		System.out.println(l);
		l.add(4);
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
	}
}

