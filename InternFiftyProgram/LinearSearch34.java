class LinearSearch34 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{12,34,46,67,787,45,23};
		int searchNo=23;
		for (int i=0 ;i<  arr.length ;i++ )
		{
			if(arr[i]==searchNo)
			{
				System.out.println(i);
			}
		}
		
	}
}
