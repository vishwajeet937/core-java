
class SeprateOddAndEven 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{2,3,4,5,6,7,8,9};
		int oddNumber=arr[0];
		int evenNumber=arr[0];
		int oddNumberStore=arr[0];
		int evenNumberStore=arr[0];
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]%2==1)
			{
				oddNumber=arr[i];
				
			}
			else if (arr[i]%2==0)
			{
				evenNumber=arr[i];
				
			}
			//System.out.println(arr[i]);
		}
		for (int j=0 ;j<arr.length ;j++ )
		{
			if (arr[j]%2==0)
			{
				oddNumberStore=arr[j];
			}
			else if (arr[j]%2==1)
			{
				evenNumberStore=arr[j];
			}
		}
		
		System.out.println("odd number is:"+oddNumber);
		System.out.println("even number is:"+evenNumber);
	}
}
