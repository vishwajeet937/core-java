class Program1111
{
public static void main(String[] args)
{
     int[] arr=new int[]{40,342,345,121,452,32432,454,323,-23,22,-50,-75,2};
        int smallestVal=arr[0];
         int largestVal=arr[0];
         for(int i=0;i<arr.length;i++)
         {
             //for(int j=i+1;j<arr.length;j++)
             {
				// System.out.println(arr[i]);
                      if(arr[i]<smallestVal)
                       {
                        smallestVal=arr[i];
                         }
                     else if(arr[i]>largestVal)
                      {
                          largestVal=arr[i];
                      }
             }
             
         }
		 System.out.println("smallest number is:"+smallestVal);
              System.out.println("largest number is:"+largestVal);
			  //System.out.println(System.out);


			  //Program1112.rv.revrseString("sonu");
}
}
