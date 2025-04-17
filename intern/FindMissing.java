class FindMissing 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{1,2,3,5};
       
       int missingVal=arr[0];
	   int smallestVal=arr[0];
	   int largestVal=arr[0];
		for (int i=0 ;i<arr.length ;i++ )
		{ 
			if (arr[i]<smallestVal)
			{
				smallestVal=arr[i];
			}
			else if (arr[i]>largestVal)
			{
				largestVal=arr[i];
			}
		}
		for (int j=0 ;j<arr.length ;j++ )
		{
             if (arr[j]==missingVal)
             {
				 missingVal=arr[j];
				 missingVal++;
             }
		}
		System.out.println(missingVal);
	}
}
