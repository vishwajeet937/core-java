package Basic_Sorting_Algorithms;

public class InsertionSort 
{ 
	  public static void insertion(int arr[])
	  {
		  for(int i=1;i<arr.length;i++)
		  {
			  int curr=arr[i];
			  int prev=i-1;
			  
			  //find out put the correct pod to insert
			  
			  while(prev>=0 && arr[prev]>curr)
			  {
				  arr[prev+1]=arr[prev];
				  prev--;
			  }
			  //insertion
			  arr[prev+1]=curr;
		  }
	  }
	  public static void printArr(int arr[])
      {
      	for(int i=0;i<arr.length;i++)
      	{
      		System.out.print(arr[i]+" ");
      	}
      	System.out.println();
      }

	public static void main(String[] args)
	{
         int arr[]= {5,4,1,3,2};
         insertion(arr);
         printArr(arr);
	}
}
