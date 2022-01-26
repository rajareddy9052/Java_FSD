package com.simplilearn.collection;

import java.util.ArrayList;

public class ArrayListDemo {
		public static void main(String[] args) {
			ArrayList<String> list=new ArrayList<String>();
			list.add("raja");
			list.add("gopal");
			list.add("reddy");
			System.out.println(list);
			list.remove(1);
			System.out.println(list);
			System.out.println(list.contains("gopal"));
			System.out.println("index: "+list.get(1));
			System.out.println(list.size());
			
		}

	}
