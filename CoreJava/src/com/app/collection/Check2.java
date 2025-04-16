package com.app.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Check2
{
   public static void main(String[] args)
   {
	   ArrayList<Object> al=new ArrayList<>();
	   al.add("sonu");
	   al.add("vishwajeet");
	   al.add("kumar");
	   al.add(1);
	   al.add(3);
	   al.add(4);
	   Iterator<Object> itr=al.iterator();
	   while(itr.hasNext())
	   {
	   System.out.println(itr.next());
	   }
   }
}
