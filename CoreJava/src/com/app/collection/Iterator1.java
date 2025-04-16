package com.app.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class Iterator1 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		Iterator<Integer> itr2=al.iterator();
		while(itr2.hasNext())
		System.out.println(itr2.next());
		

	}

}
