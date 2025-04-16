package com.app.i.o.Stream;


	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

	public class ReadingHtmlData 
	{
	    
		public static void main(String[] args) throws IOException 
		{
			File f=new File("D:"+File.separator +"Html"+File.separator +"Program2.Html");
			FileReader reader= new FileReader(f);
			int ch;
			while((ch=reader.read())!=(-1))
			{
				System.out.print((char)(ch));
			}
		}

	}

