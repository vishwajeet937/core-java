//import java.util.Scanner;
class FindDuplicateElement 
{
	public static void main(String[] args) 
	{
		//Scanner scan=new Scanner(System.in);

		int[] arr=new int[]{1,2,3,2,3,4,3,4,5};

		for (int i=0 ;i<arr.length ;i++ )
		{
			for (int j=i+1 ;j<arr.length ;j++ )
			{
				if (arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}
	}
}
