package Arrays;

public class LinearSearch
{
   /* public static int linearSearch()
    {
    	for(int i=0;i<num.length;i++)
    	{
    		if(num[i]==key)
    	}
    	return 11;
    }
	public static void main(String args[])
	{
		int num[]= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		int key=10;

	}*/
	/*public static void main(String[] args) 
	{
		int[] arr={34,23,3,54,655,6,4,61};
         
		 int item=655;
		for (int i=0 ;i<arr.length ;i++ )
		{
			if (arr[i]==item)
			{
				System.out.println(i);
			}
		}
	}*/
	/*public static int linear(int[] num,int key)
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==key)
			{
				return i;
			}
			
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int num[]= {2,3,4,5,6,7,8,9};
		int key=9;
		int index=linear(num,key);
		if(index==-1)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println(index);
		}
	}*/

	
	
	public static int linear(int num[],int key)
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==key)
			{
				//key=key;
				System.out.println("found:"+key);
				return i;
			}
			else if(key==0)
			{
				System.out.println("not found");
			}
			
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int num[]= {2,3,4,5,6,7,8,9};
		int key=9;
		//int num=4;
		linear(num,key);
		
	}
}
