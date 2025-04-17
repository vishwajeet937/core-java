class FindOddAndEven
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{123,3242,657,34423,546,34,546,2423,5634 };
		
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
				
				System.out.println("even number:"+arr[i]);
			}
		}
			for (int j=0 ;j<arr.length ;j++ )
			{
			
			   if (arr[j]%2==1)
			  {
				System.out.println("odd number:"+arr[j]);
			  }
			}
		
	}
}
