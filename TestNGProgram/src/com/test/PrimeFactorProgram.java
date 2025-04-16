package com.test;

import java.util.ArrayList;

public class PrimeFactorProgram 
{
		public static ArrayList primeFactors(int num)
		{
			ArrayList al=new ArrayList();
			for(int i=2;i<=num;i++)
			{
				while(num%i!=0)
				{
				al.add(i);
					num=(num/i);
				}
			}
			return al;
		}

}

