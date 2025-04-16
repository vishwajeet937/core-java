package com.app.stringHandeling;

import java.util.LinkedHashMap;

public class Check121
{

	public static void main(String[] args)
	{
		String name="my name is sonu kumar";
		String[] name1=name.split(" ");
		LinkedHashMap<Integer,String> m=new LinkedHashMap();
		for(int i=0;i<name1.length;i++)
		{
			m.put(i+1,name1[i]);
		
		}
         System.out.println(m); 
         System.out.println(m.keySet());
         for(Integer i:m.keySet())
         {
        	System.out.println(m.get(i)); 
         }
         
	}

}
