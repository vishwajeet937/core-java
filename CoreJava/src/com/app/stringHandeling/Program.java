package com.app.stringHandeling;

public class Program 
{

	public static void main(String[] args)
	{
		//mutable 
		//string is a immutable class and also mentanining a area which is inside the
		//heap area.
		
		
		//why string is maintaining poll area?
		//for resubality regarding string is maintaining poll area.
		
		//when string is not stored in poll area?
		//when ever we will modify string by using any method then we will get an another
		//string as a return but that return string will not going to maintain inside the 
		//poll area.
		String name="vishwajeet";
		System.out.println(System.identityHashCode(name));
		name.concat(name);
		// name=name.concat(" kumar");
		 System.out.println(System.identityHashCode(name));
		 System.out.println(name);
		
		 //Buffer
		 
		 //StringBuffer is Thread Shafe
		 StringBuffer buffer=new StringBuffer("sonu");
		 System.out.println(System.identityHashCode(buffer));
		 buffer.append(" kumar");
		 System.out.println(System.identityHashCode(buffer));
		 System.out.println(buffer);
		 
		//Bulder
		 StringBuilder builder=new StringBuilder("kumar");
		 System.out.println(System.identityHashCode(builder));
		 builder.append(" sachin");
		 System.out.println(System.identityHashCode(builder));
		 System.out.println(builder);
		 
	}

}
