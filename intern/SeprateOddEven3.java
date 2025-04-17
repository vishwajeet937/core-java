import java.util.Arrays;
class SeprateOddEven3 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{3,2,1,4,5,6,7,8,9};
         
		 int odd=arr[0];
		 int even=arr[0];
		 //int seprateOdd=arr[0];
		 //int seprateEven=arr[0];
		 
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]%2==1)
			{
				odd=arr[i];
				i++;
				
			}
			else if (arr[i]%2==0)
			{
                even=arr[i];
				i++;
			}
		}
		for (int j=0 ;j<arr.length ;j++ )
		{
			if (arr[j]%2==1)
			{
                odd=arr[j];
				  j--;
				
			}
			else if (arr[j]%2==0)
			{
				even=arr[j];
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
		/*System.out.println("odd Number is:"+odd);
		System.out.println("Even Number is:"+even);
		System.out.println("seprate odd number is:"+seprateOdd);
		System.out.println("seprate even number is:"+seprateEven);*/
	}
}
