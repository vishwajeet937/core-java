package com.app.logical;



public class Demo4 
{
    public static int[] odd(int i1,Demo4 d) throws Exception
    {
    	int[] arr=new int[] {3,24,435,65,7663,42,56,76};
    	for(int i=0;i<arr.length;i++)
    	{
    		if(arr[i]%2==1)
    		{
    			Thread.sleep(1000);
    			System.out.println(arr[i]);
    		}
    	}
    	
    	int[] arr1=new int[]{123,324,54567,324,546,898};
    	for(int i=0;i<arr1.length;i++)
    	{
    		if(arr1[i]%2==0)
    		{
    			try
    	        {
    	        Thread.sleep(10000);
    	        }
    	        catch(Exception e)
    	        {
    	        	e.printStackTrace();
    	        }
    			System.out.println(arr1[i]);
    		}
    	}

    	return new int[] {};
    }
    
    public Demo4 even()
    {
    	int[] arr1=new int[]{1,2,3,4,5,6,7,8,9};
    	for(int i=0;i<arr1.length;i++)
    	{
    		if(arr1[i]%2==0)
    		{
    			System.out.println(arr1[i]);
    		}
    	}
    	return new Demo4();
    }
    public Object m1()
    {
    	System.out.println("Return type of Object");
    	return new Object();
    }
    
    
	public static void main(String[] args)throws Exception
	{
		Demo4.odd(3,new Demo4());
		Demo4 d=new Demo4();
		d.even();
		d.m1();
		

	}

}
