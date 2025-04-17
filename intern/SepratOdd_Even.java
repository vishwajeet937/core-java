import java.util.Arrays;
class SepratOdd_Even 
{
	public static void main(String[] args) 
	{
		int evenNumCount=0;
		int oddNumCount=0;
		int val=0;
		boolean flag=false;
		int[] arr=new int[]{7,8,4,5,2,1,3,13,14,10}; 
		int[] arr01=new int[arr.length]; 
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]%2==0 )
			{
                evenNumCount++;
			}
			else if (arr[i]%2==1 )
			{
                oddNumCount++;
				
			}
		}

for (int j=0;j<arr.length ;j++ )
{
	
 if (arr[j]%2==0 && evenNumCount>0)
{
	
 arr01[val]= arr[j];
 val++;
evenNumCount--;
}
 //System.out.println(Arrays.toString(arr01));

}

for (int j=0;j<arr.length ;j++ )
{
	
 if (arr[j]%2!=0 && oddNumCount>0)
{
	 
 arr01[val]= arr[j];
 val++;
oddNumCount--;
}



}
System.out.println(Arrays.toString(arr01));


	}
}
