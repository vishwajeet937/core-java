package com.app.logical;
import java.util.*;
/*import java.sql.Date;
import java.util.ArrayList;
import java.util.List;*/
@SuppressWarnings(value={"unchacked","deprecated"})
public class AnnotationTest
{
	@Override
   public String toString()
   {
	   return "Hello";
   }
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Annotation");
		AnnotationTest at=new AnnotationTest();
        System.out.println(at.toString());
        
        List l=new ArrayList();
        l.add("Sonu");
        l.add("kumar");
        System.out.println(l);
        
        Date d=new Date();
        System.out.println("Current Day:"+d.getDay());
	}

}
