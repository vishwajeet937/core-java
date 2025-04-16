package com.app.multiThread;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class LogicalInThread extends Thread
{
	private int val=101; //private value we can right in only class level
	public void run()
	{
		this.run(1);
		String name="vishwajeet kumar";
	    String name1="vishwajeet kumar";
	    System.out.println(name==name1);
	}
    public void run(int i)
    {
    	this.run("Sting");
    	String name="Sonu";
    	String name1=name.concat("kumar");
    	System.out.println(name1);
    }
    public void run(String s)
    {
    	int val1=102;
    	try
    	{
    		int dev=val1/val;
    		System.out.println(dev);
    		throw new Exception();
    		
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		System.out.println("finally");
    	}
    }
    static
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int val=scan.nextInt();
    	int[] arr=new int[val];
    	for(int i=0;i<arr.length;i++)
    	{
    		if(i%2==0)
    		{
    			System.out.println("Even Number is:"+i);
    		}
    	}
    }
    {
    	ArrayList<Float> al=new ArrayList<>();
    	System.out.println(al);
    	al.add(1.2f);
    	al.add(2.3f);
    	al.add(3.4f);
    	al.add(4.5f);
    	al.add(5.6f);
    	for(float f:al)  //for each loop
    	{
    		System.out.println(f);
    	}
    }
    static
    {
    	ArrayList al=new ArrayList();
    	al.add(9);
    	al.add(8);
    	for(Object obj:al)
    	{
    		System.out.println(obj);
    	}
    }
    static
    {
    	int[] arr1=new int[]{1,2,3,4,5,6,7,8,9};
    	/*for(int i=arr1.length;i>0;i--)
    	{
    		System.out.println("ReverseNumber is:"+i);
    	}*/
    	for(int arr11:arr1)
    	{
    		
    		System.out.println("By for each loop:"+arr11);
    	}
    }
    static
    {
    	int[] arr2={1,2,3,4,5,4,3,2};
    	int sum=0;
    	for(int i=0;i<arr2.length;i++)
    	{
    		for(int j=i+1;j<arr2.length;j++)
    		{
    			if(arr2[j]==arr2[i])
    			{
    				System.out.println("DuplicateNumber is:"+arr2[i]);
    				sum+=arr2[j];
    				System.out.println("Duplicate Number of sum is:"+sum);
    			}	
    		}
    	}
    }
    static
    {
    	//print 0 and 1 sapret number
    	int[] arr3={0,1,2,3,4,5,6,0,0,1,2,1};
    	int valZero=0;
    	//int valOne=0;
    	for(int i=0;i<arr3.length;i++)
    	{
    		if(arr3[i]==0)
    		{
    			
    			valZero++;
    		}
    		
    	}
    	for (int j=0 ;j<arr3.length ;j++ )
		{
             if (valZero>0)
             {
				 arr3[j]=0;
				 valZero--;
             }
        }
    	System.out.println(Arrays.toString(arr3));
    }
    static
    {
    	System.out.println("*******************");
		int[] arr=new int[]{1,1,1,0,0,0,0,1,1,0,1,0,1,0,1,0};

        int zeroCount=0; 
		   int oneCount=0;
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]==0)
			{
             zeroCount++; 
			}
			else if (arr[i]==1)
			{
				oneCount++;
			}
		}
		for (int j=0 ;j<arr.length ;j++ )
		{
          if (zeroCount>0)
          {
				 arr[j]=0;
				 zeroCount--;
          }
			 else if (oneCount>0)
			 {
				 arr[j]=1;
				 oneCount--;
			 }
		}
		System.out.println(Arrays.toString(arr));

	}
    
   
	public static void main(String[] args) 
	{
		LogicalInThread lt=new LogicalInThread();
        lt.start();
	}

}
