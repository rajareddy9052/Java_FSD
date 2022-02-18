package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexdemo1 {
	public static void main(String[] args) {
		String pattern=" abc";
		Pattern p=Pattern.compile(pattern);
		Matcher match=p.matcher("a");
		System.out.println(match.matches()+pattern);
	}

}
