package com.app.nonStatic;

public class ReturnKeyWordInClassType
{
     public static Integer name(Integer j)
     {
    	 System.out.println(j);
		return j;
     }
     public static ReturnKeyWordInClassType m1(ReturnKeyWordInClassType r)
     {
    	 System.out.println(r);
    	 return r;
     }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        name(null);
        name(896);
        ReturnKeyWordInClassType.m1(new ReturnKeyWordInClassType());
	}

}
