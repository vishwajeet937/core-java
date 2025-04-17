class FindMissing2 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{1,8,7,4,6,3,2};

		int smallest=arr[0];
		int largest=arr[0];

        int val=0;
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
			System.out.println(arr[i]);
		}
		for (int j=smallest ;j<largest ;j++ )
		{
			for (int k=0 ;k<arr.length ;k++ )
			{
				if (arr[k]==j)
				{
					val++;
				}
			}
				 if (val==0)
				{
					System.out.println(j+"missing number");
					val=0;
				}

			
			
		}
		
	}
}
