class SmallestAndLargest8 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{122,4,532,5654211,56,34,667,-5,-343,};

		int smallest=arr[0];
		int largest=arr[0];
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
		}
		System.out.println("smallest number is:"+smallest);
		System.out.println("largest number is:"+largest);
	}
}
