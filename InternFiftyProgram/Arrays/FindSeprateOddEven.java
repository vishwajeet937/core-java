import java.util.Arrays;
class FindSeprateOddEven 
{
	public static void main(String[] args) 
	{
		int arr[]=new int[]{1,2,3,4,9,6,7,8,5,21,12,345,567,11,432,32,66};
       
	      int sepEvenCount=arr[0];
		  int sepOddCount=arr[0];
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]%2==0)
			{
               sepEvenCount++;
			}
			else if (arr[i]%2==1)
			{
				sepOddCount++;
			}
		}
		System.out.println(sepEvenCount);
		System.out.println(Arrays.toString(arr));
	}
}
