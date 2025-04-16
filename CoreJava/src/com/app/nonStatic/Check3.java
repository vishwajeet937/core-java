 package com.app.nonStatic;

public class Check3 
{
  public static Integer m1(Integer i)
  {
	  int j=11;
	  System.out.println("j Is:"+j);
	  return i;
  }
  public static int[]  m2(String name)
    {
	  System.out.println("m2 is:");
	  return new int[] {};
	}
   public Check3 m3(int[] i,float[] f,int i1)
   {
	   System.out.println("m3");
	   return new Check3(); 
   }
	public static void main(String[] args)
	{
		Check3.m1(21);
		m2("nbc");
		
		Check3 c=new Check3();
		c.m3(new int[] {},new float[]{},21);

	}

}
