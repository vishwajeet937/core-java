class FindOddAndEven
{
	public static void main(String[] args) 
	{
		int arr[]=new int[];
		
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
				System.out.println("odd number:"+arr[j])
			  }
			}
		
	}
}
