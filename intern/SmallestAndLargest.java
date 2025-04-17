class SmallestAndLargest 
{
	public static int getLaragetsNum(int[] arr){
    
		
		int largestNumber=arr[0];
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]<largestNumber)
			{
				largestNumber=arr[i];
			}
			
		}
		return largestNumber;
	}

	public static int getSmallestNum(int[] arr){
    
		int smallestNumber=arr[0];
		
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]>smallestNumber)
			{
				smallestNumber=arr[i];
			}
			
		}

		return smallestNumber;
	}
	public static void main(String[] args) 
	{
		int largestNum=getLaragetsNum(new int[]{12,10,15,7,11});
			int smallest=getSmallestNum(new int[]{12,10,15,7,11});
		System.out.println("Largest Number is:"+smallest);
		System.out.println("smallest Number is:"+largestNum);

		for(in ti=0;i<arr.length;i++){

	}
}
