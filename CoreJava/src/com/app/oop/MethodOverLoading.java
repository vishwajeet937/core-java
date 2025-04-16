package com.app.oop;

public class MethodOverLoading 
{
	
     public static int overLoading(int i)
     {
    	// i=1232;
    	 System.out.println("int:"+i);
    	 return 1;
     }
     public static String overLoading(String s)
     {
    	 System.out.println("String");
    	 return s;
     }
     public static float overLoading(float f)
     {
    	 System.out.println(f);
    	 return f;
     }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		MethodOverLoading.overLoading(11);
		MethodOverLoading.overLoading("String Type");
	    MethodOverLoading.overLoading(22.2f);
	}

}
