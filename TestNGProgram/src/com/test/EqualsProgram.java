package com.test;

import java.util.ArrayList;

public class EqualsProgram
{
	public static ArrayList equalMethods(String word,int n) 
	{
		ArrayList obj=new ArrayList();
		int chars=word.length()/n,temp=0;
		String [] equalString=new String[n];
		if(word.length()%n!=0)
		{
			
		}
		else
		{
			for(int i=0;i<word.length();i=i+chars){
				String parts=word.substring(i,i+chars);
				equalString[temp]=parts;
				temp++;
			}
		
		
		for(int j=0;j<equalString.length;j++){
			obj.add(equalString[j]);
		}
		
		}
		return obj;
		}

}
