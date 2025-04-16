package com.app.collection;
import java.util.Stack;
public class Test04_Stack
{

	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<>();
		System.out.println(s);
		s.push("a");
		s.push("b");
		s.push("c");
		s.push("d");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);

		System.out.println(s.search("a"));
		
		//s.add(Colour.ORANGE);
	}

}
