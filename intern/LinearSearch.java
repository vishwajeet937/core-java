class LinearSearch 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{34,23,3,54,655,6,4,61,6};
         
		 int item=622222;
		 int temp=0;
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]==item)
			{
				System.out.println("client is present as:"+i+" "+"index of position");
			}
		}
		if (temp==0)
		{
			System.out.println("item is not present in the least");
		}
	}
}
