class SeprateOddNumber 
{
	public static void seprateOdd1()
	{
		for (int j=0 ;j<arr.length ;j++ )
		{
            if (j%2==1)
            {
				seprateOdd=arr[j];
				System.out.println(j);
            }
		}
	}
	public static void main(String[] args) 
	{
		SeprateOddNumber s=new SeprateOddNumber();
		s.seprateOdd1();
		int[] arr=new int[]{12,17,70,15,22,65,21,90};
		int seprateOdd=0;
		int seprateEven=0;
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (i%2==0)
			{
				seprateEven=arr[i];
				System.out.println(arr[i]);
			}
			/*else if (i%2==1)
			{
				seprateOdd=arr[i];
				//System.out.println(arr[i]);
			}*/
		}
		//System.out.println(seprateEven);
		//System.out.println(seprateOdd);
		
	}
}
