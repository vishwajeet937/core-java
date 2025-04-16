package com.test;

import java.util.ArrayList;

public class PostiveNegative
{
   public static ArrayList postive(ArrayList<Integer> ar)
   {
	   ArrayList<Integer> s=new ArrayList<Integer>();
	  for(int i=0;i<ar.size();i++)
	  {
		  if(ar.get(i)>=0)
		  {
			  s.add(ar.get(i));
		  }
	  }
	  
	  return s;   
   }
   
}
