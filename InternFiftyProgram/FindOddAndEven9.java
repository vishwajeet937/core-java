class FindOddAndEven9 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{1,2,3,4,5,6,121,343,565,23,45,22222};
		System.out.println("odd number");
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
          System.out.println("even number");
			for (int j=0 ;j<arr.length ;j++ )
			{
				if(arr[j]%2!=0) 
			     {
                System.out.println(arr[j]);
			     }
			}
			 
			
	}
		
}

