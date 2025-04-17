class MissingNumber 
{
	public static void main(String[] args) 
	{
		
		int[] arr1={1,2,4,5,6};
		System.out.println(missingNumber(arr1));
	}
	public static int missingNumber(int[] arr)
	{
		int n,sum,restSum=0; 
		int n=arr.lenght+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i=0 ;i<arr.length ;i++ )
		{
			restSum+=arr[i];
			int missingNumber=sum-restSum;
            return missingNumber;
		}
	}
}
