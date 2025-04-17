import java.util.Arrays;
class SecondLargest3 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{12,4345,4646747,3234,674,442};
         int val=0;
		for (int i=0 ;i<arr.length ;i++ )
		{
			for (int j=i+1 ;j<arr.length ;j++ )
			{
				if (arr[j]<arr[i])
				{
				
                  int val=arr[i];
				  arr[i]=arr[j];
				  arr[i]=val;
				}
			}
		}
		System.out.println(arr[arr.length-2]);
	}
}
