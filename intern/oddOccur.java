class OddOccur 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{12,45,23,6,8,1,1,2,3,5};
		int oddOccur=0;
		for (int i=0;i<arr.length ;i++ )
		{
			if(arr[i]%2!=1)
             oddOccur++;
		}
		System.out.println("odd no occur timing is: "+oddOccur);

	}
}
