class FindSmallestElement 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{6,5,4,3,2,8,1,9};
		int smallest=arr[0];
		int largest=arr[0];
        
		for (int i=0 ;i<arr.length ;i++ )
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
		System.out.println("smallest noumber is:"+smallest);
		System.out.println("largest noumber is:"+largest);
	}
}
