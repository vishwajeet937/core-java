package com.app.java8NewFeatures;
//Lambda Exprection

interface  ISchool 
{
	public abstract void reg();

	public static void main(String[] args)
	{
		ISchool is=()->
		{
			int n=11;
			for(int i=0;i<=n;i++)
			{
				System.out.println(i);
			}
		};
		is.reg();

	}

}
