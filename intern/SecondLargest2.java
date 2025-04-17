import java.util.Arrays;
class SecondLargest2 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{12,453,6586,9090,546345,33,1,3,5,7,8,9,57756};
        int smallest=arr[0];
		 int largest=arr[0];
		for (int i=0 ;i<arr.length ;i++ )
		{
              if (arr[i]<smallest)
              {
				  smallest=arr[i];
              }
			  else if (arr[i]>largest)
			  {
				  largest=arr[i];
			  }
		}
		System.out.println("Second largest number is:"+arr[arr.length-1]);
		//System.out.println("firest largest number is:"+largest);
	}
}
