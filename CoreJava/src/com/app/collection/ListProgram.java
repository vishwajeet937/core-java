package com.app.collection;

import java.util.ArrayList;
import java.util.List;

public class ListProgram
{
 public static void main(String args[])
 {
	 List l=new ArrayList();
	 l.add(l);
	 l.add(2);
	 System.out.println(l);
	 System.out.println(l.add("xxx"));
	 System.out.println(l);
 }
}

