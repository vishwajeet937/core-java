package com.test;

public class LogicRelated {
	public static int getSmallestNum(int[] arr)
	{
		int smallest=arr[0];
		
		for (int i=0 ;i<arr.length ;i++ )
		{
			
			
		 if (arr[i]<smallest)
			{
				
					smallest=arr[i];
				
			}
			//System.out.println(arr[i]); 
			
		}
		return smallest;
	}

	
	public static int getGreatestNum(int[] arr) {
		//write logic to find greatest num
		//int[] arr=new int[]{1,98,76,556,23,55};
		int smallest=arr[0];
		int largest=arr[0];
		for (int i=0 ;i<arr.length ;i++ )
		{
			
			if (arr[i]>largest)
			{
				largest=arr[i];
				//System.out.println(arr[i]);     //buding Debuging
			}
			else if (arr[i]<smallest)
			{
				
					smallest=arr[i];
				
			}
			//System.out.println(arr[i]); 
			
		}
		//System.out.println("smallest number is:"+smallest);
			//System.out.println("largest number is:"+largest);
		
		return largest;
		
	}
}
