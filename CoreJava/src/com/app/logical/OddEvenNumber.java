package com.app.logical;

public class OddEvenNumber
{

	public static void main(String[] args) 
	{
	
		int num=12;
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println("EvenNumber is:"+i);
			}
			else
			{
				System.out.println("OddNumber is:"+i);
			}
		}

	}

}
