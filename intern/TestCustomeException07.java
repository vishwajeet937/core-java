import java.util.Scanner;
class TestCustomeException07 
{
	public static void main(String[] args) 
	{
		try
		{
			 int[] arr=new int[]{34,56,78,98,101,100};

		int firstLargestNumber=arr[0];
		int secondLargestNumber=arr[0];
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (firstLargestNumber>arr[i])
			{
				firstLargestNumber=arr[i];
			}
			else if (secondLargestNumber<arr[i])
			{
				secondLargestNumber=arr[i];
			}
		}
		System.out.println(firstLargestNumber);
		System.out.println(secondLargestNumber);
		catch (RuntimeException r)
		{
			System.out.println("catch");
		}
	  }
		
	}
}
