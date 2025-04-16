package com.app.i.o.Stream;
import java.io.*;
public class Durga4
{

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
       FileInputStream fis=new FileInputStream("test.txt");
       
       int i;
       while((i=fis.read())!=-1)
       {
    	   System.out.println(i+".....");
    	   System.out.println((char)i);
       }
	}

}
