class ForEachLoop 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{12,13,14,15,16,17,12121121,32412,32,34,324,3,123};
		int total=0;
		for (int i:arr)
		{
			total=total+i;
			
		}
		System.out.println(total);
			
	}
}
