class SumOfArray 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{34,56,87,43};
		int sum=0;
		int multiply=1;
         for (int i=0 ;i<arr.length ;i++ )
         {
			 sum=sum+arr[i];
			 multiply=multiply*arr[i];
         }
		 System.out.println("sum of Array is:"+sum);
		 System.out.println("Multiply of Array is:"+multiply);
	}
}
