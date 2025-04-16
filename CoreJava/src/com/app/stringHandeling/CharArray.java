package com.app.stringHandeling;

public class CharArray 
{
public static void m1(char[] ch,int offset,int count)
  {
  	 char[] ch1={'a','b','c','d','e','f'};
  	 String s7=new String(ch1,2,3);
  	 System.out.println("s7:"+s7);
  }

public static void m2()
 {
	char[] ch={'v','i','s','h','w','a','j','e','e','t'};
	String s1=new String(ch);
	System.out.println(s1);
	System.out.println(ch[2]);
 }
public static void m3(byte[] b1)
  {
	byte[] b= {97,98,99};
	String s8=new String(b);
	System.out.println(s8);
  }
 public static void m4(byte[] b,int offset,int count)
 {
	 byte[] b2={65,66,67,68};
	 String s9=new String(b2,1,3);
	 System.out.println("s9:"+s9);
 }
 
   public static void m5()
   {
	  // String s11=new String(null);          ambiguous error
	    
	  // String s12=null;
	  // String s13=new String(s12);             //N ullpointerException error
	  // System.out.println(s13);
	   
	   String s14=new String((StringBuffer)null);           //NullPointerException error
   }

	public static void main(String[] args)
	{
		//CharArray.m1(null, 0, 0);
		//CharArray.m2();
		//CharArray.m3(new byte[] {});
		//CharArray.m4(null, 0, 0);
		CharArray.m5();
		
		/* byte[] b2={65,66,67,68};
		 String s9=new String(b2,1,3);
		 System.out.println("s9:"+s9);*/
		
		

	}

}
