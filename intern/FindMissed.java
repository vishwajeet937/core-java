class FindMissed 
{
	public static void main(String[] args) 
	{
		int [] arr=new int[]{13,16,15,14,12,9,11};

int val=0;
		int smallest=arr[0];
        int largest=arr[0];

		for(int i=1;i<arr.length;i++){

         if(smallest>arr[i]){
          smallest=arr[i];
          
		 }

		 else if(largest<arr[i]){
           largest=arr[i];
		 }
		 

		}



		for(int j=smallest;j<=largest;j++)
			{
			
			for(int k=0;k<arr.length;k++)
				{
			if(arr[k]==j)
				val++;

			    }

             if(val==0)
			System.out.println(j+" :is missing");

            val=0;
			
	     	}



	}
}
