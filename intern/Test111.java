class Test111
{
public static void main(String[] args)
{
      int[] arr=new int[]{1,0,1,0,1,0,0,1,1,1,1};

        int valZero=arr[1];
        int valOne=arr[1];
       for(int i=0;i<arr.length;i++)
        {
             if (arr[i]==0)
             {
                //valZero=arr[i];
				valZero++;
             }
            else if(arr[i]==1)
             {
                //valOne=arr[i];
				valOne++;
             }
        }
System.out.println("Zero value count is:"+valZero);
System.out.println("onr value count is:"+valOne);
}
}