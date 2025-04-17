class BinearySearch
{
	public static void main(String[] args) 
	{
		int[] arr={1,3,2,5,4,7,6,9,8};
		int search=9;
		int lowearIndex=0;
		int heigherIndex=arr.length-1;
		int midelIndex=(lowearIndex+heigherIndex)/2;
		while (lowearIndex<=heigherIndex)
		{
			if (arr[midelIndex]==search)
			{
				System.out.println("item present in:"+midelIndex+"index position");
			}
			else if (arr[midelIndex]<search)
			{
				lowearIndex=midelIndex+1;
			}
			else 
			{
				heigherIndex=midelIndex-1;
			}
			midealIndex=(lowearIndex+heigherIndex)/2;
		}
		if (lowearIndex>heigherIndex)
		{
			System.out.println("element not found");
		}
	}
}
