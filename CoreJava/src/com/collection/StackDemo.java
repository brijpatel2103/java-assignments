package com.collection;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(100);
		System.out.println(s);
		s.push(100.10);
		System.out.println(s);
		s.push("tops");
		System.out.println(s);
		s.push('t');
		System.out.println(s);
		s.push(true);
		System.out.println(s);
		s.push(null);
		System.out.println(s);
		s.push(100);
		
		System.out.println(s);
		
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
	}

}
