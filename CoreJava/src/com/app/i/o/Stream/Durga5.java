package com.app.i.o.Stream;
import java.io.*;
public class Durga5 
{

	public static void main(String[] args)throws FileNotFoundException,IOException
	{
         FileOutputStream fos=new FileOutputStream("ccd.txt");
         fos.write('a');
         fos.write('b');
         fos.write(99);
         System.out.println("Data written to file");
	}

}
