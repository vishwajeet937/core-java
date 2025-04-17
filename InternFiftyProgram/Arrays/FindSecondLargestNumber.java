class FindSecondLargestNumber 
{
	public static int secondLargestNumber(int[] a,int total)
	{
	 
		int secondLargest=0;
		for (int i=0 ;i<a.length-1 ;i++ )
		{
            if (a[i]>secondLargest)
            {
				secondLargest=a[i];
            }
		}
		
		return a[total-3];
	}
	public static void main(String[] args) 
	{
		 int[] arr=new int[]{34,65,78,98,21,12,32,123,6,8,5,765687};
				//FindSecondLargestNumber.secondLargestNumber(arr,1);
				System.out.println("FindSecondLargestNumber:"+secondLargestNumber(arr,12));
	}
}
