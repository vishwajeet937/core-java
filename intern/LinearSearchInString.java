class LinearSearchInString 
{
	public static void main(String[] args) 
	{
		String[] arr={"sonu","monu","sachin","vishwajeet","Triniti"};

		String name="vishwajeet1";
        int temp=0;
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i].equals(name))
			{
				System.out.println("Name present is:"+i+" "+"index position");
			}
		}	
		
	     if (temp==0)
		{
			System.out.println("item not present in the least");
		}
		
	}
}
