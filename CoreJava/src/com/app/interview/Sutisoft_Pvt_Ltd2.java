package com.app.interview;

public class Sutisoft_Pvt_Ltd2
{
    int i;
    static int j;
    {
    	System.out.println("i is:"+i);
    }
    static
    {
    	System.out.println("j is:"+j);
    	method_2();
    }
    {
    	i=5;
    }
    static 
    {
    	j=10;
    }
    Sutisoft_Pvt_Ltd2()
    {
    	System.out.println("welcome");
    }
	public static void main(String[] args)
	{
		Sutisoft_Pvt_Ltd2 s=new Sutisoft_Pvt_Ltd2();
	}
        public void method_1()
        {
        	System.out.println("method-1");
        }
        static
        {
        	System.out.println(j);
        }
        {
        	System.out.println(i);
        	method_1();
        }
        public static void method_2()
        {
        	System.out.println("m-2");
        }
	}


