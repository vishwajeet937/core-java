package com.app.arrays;

public class ReverseNumber1 
{
  public static void reverseString()
   {
	  String name="Vishwakeet Kumar";
	  String[] name1=name.split(" ");
	  String result="";
	  for(int i=name1.length-1;i>=0;i--)
	  {
		  //result+=name1[i]+" ";
		  result=result+name1[i]+" ";               //Laine No 12and13 are equal 
	  }
	  System.out.println(result);
   }
	public static void main(String[] args)throws Exception
	{
		//Reverse array
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		for(int i=arr.length-1;i>=0;i--)
		{
			Thread.sleep(1000);
			System.out.println(arr[i]);
		}
   
		ReverseNumber1.reverseString();
	}

}
