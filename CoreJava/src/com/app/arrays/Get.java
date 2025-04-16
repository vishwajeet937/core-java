package com.app.arrays;

public class Get
{
	
	    public static int sumElement(int arr[], int n)
	    {
	        // Your code here
	        int[] arr1=new int[]{3,2,1};
	       int sum=0;
	        for(int i=0; i<=arr1.length-1; i++)
	        {
	            sum=sum+i;
	            System.out.println(sum);
	            
	        }
	        int[] arr2=new int[]{1,2,3,4};
	        int sum1=0;
	        
	        for(int j=0;j<=arr2.length-1;j++)
	        {
	            sum1=sum1+j;
	            System.out.println(sum1);
	        }
	        return 2;
	    }
	    public static void main(String[] args)
	    {
	        Get.sumElement(new int[]{},1);
	    }
	
}
