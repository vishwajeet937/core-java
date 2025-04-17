import java.util.Arrays;
class Seprate0_1
{
	public static void main(String[] args) 
	{
		int[] arr=new int[]{1,0,1,1,1,0,0,0,1,0,1,0,};
		int val1=0;
		int val2=1;
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]==0)
			{
				val1++;
			}
			else if(arr[i]==1)
			{
				val2++;
			}
		}
		for (int j=0 ;j<arr.length ;j++ )
		{
			if (val1>0)
			{
				arr[j]=0;
				val1--;
			}
			else if(val2>0)
			{
				arr[j]=1;
				val2--;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
