package com.app.NatarajSir;

public class TestApp 
{
    static 
    {
    	System.out.println("TestApp:: static block");
    }
	public static void main(String[] args)throws Exception
	{
		System.out.println("start main(-)method");
        Test t=new Test();
        Test t1=new Test();
        Test t2=new Test();
        
       System.out.println("...................................");
   
       //Class.forName("Demo");
       Class.forName("com.app.NatarajSir.Demo");
       Class.forName("com.app.NatarajSir.Demo");
      // Class.forName("Test");
    
       System.out.println("end of main(-)method");
	}

}
