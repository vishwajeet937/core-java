package com.app.arrays;

public class Palimdrome
{
    public static void m1()
    {
    	int i;
        int sum=0;
        int temp;
        
        int num=12321;
        temp=num;
        while(num>0)
        {
        	i=num%10;
        	sum=(sum*10)+i;
        	num=num/10;
        }
        if(temp==sum)
        {
        	System.out.println("palindrome number");
        }
        else
        {
        	System.out.println("not palindrome number");
        }
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Palimdrome.m1();
	}

}
