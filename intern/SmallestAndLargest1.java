import java.util.Arrays;
class SmallestAndLargest1 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{20,3,4,6,7,8,9};
		int smallest=arr[0];
		int largest=arr[0];
		for (int i=1 ;i<arr.length ;i++ )
		{
			if (arr[i]<smallest)
			{
				smallest=arr[i];
			}
			else if(arr[i]>largest)
			{
				largest=arr[i];
			}
			
		}
		System.out.println("Smallest number is:"+smallest);
			System.out.println("largest number is:"+largest);
			
			
		
	}
}
