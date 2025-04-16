package com.app.collection;

import java.util.ArrayList;

public class ArrayListDemo 
{
	public static void main(String[] args) 
	{
       ArrayList al=new ArrayList();
       System.out.println("is Empty:"+al.isEmpty());
       al.add("s");
       al.add("o");
       al.add("n");
       al.add("u");
       al.add("k");
       al.add("u");
       al.add("m");
       al.add("a");
       al.add('r');
       al.add(5);  
       al.add(6);
       System.out.println("size:"+al.size());
       System.out.println("element:"+al);
       System.out.println("3rd index  object:"+al.get(3));
	}
}
