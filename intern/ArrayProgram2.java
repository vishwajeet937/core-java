import java.util.Arrays;
class ArrayProgram2 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[8];
		for (int i=0 ;i<=arr.length ;i++ )
		{
			arr[i]=i*i;
			System.out.println(arr[i]);
		}
	}
}
