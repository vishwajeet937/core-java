class SmallestAndLargest2 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{23,434,43,566,86,97,566666};
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
		  System.out.println("smallest no is:"+smallest);
		  System.out.println("largest no is:"+largest);
	}
}
