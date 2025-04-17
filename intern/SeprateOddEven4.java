class SeprateOddEven4 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{9,8,7,6,5,4,3,2,1};
         
		 int even=arr[0];
		 int odd=arr[0];
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
				even=arr[i];
				System.out.println(even);
			}
			
		}
		for (int j=0 ;j<arr.length ;j++ )
		{
			if (arr[j]%2==1)
			{
               System.out.println(arr[j]);
			}
		}
		
	}
}
