package com.app.collection;
import java.util.ArrayList;
public class ForEachLoop
{

	public static void main(String[] args) throws InterruptedException 
	{
		//with generic
		ArrayList<String> al=new ArrayList();
		al.add("vishwajeet");
		al.add("Kumar");
		Thread.sleep(10000);
		al.add("singh");
		al.set(0,"Sonu");
		al.add(1,"kr");
		for(String s:al)
		{
			System.out.println(s);
		}
		try 
		{
			Thread.sleep(10000);
		}
		 catch (InterruptedException e) 
		{	
			e.printStackTrace();
		}
		//without generic
		ArrayList al1=new ArrayList();
		al1.add("Ram");
		al1.add("kumar");
		al1.add("Singh");
		al1.set(1,"");
		for(Object obj:al1)
		{
			System.out.println(obj);
		}

	}

}
