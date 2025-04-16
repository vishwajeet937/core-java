package Parrten_Parts2;
class Pattern
{
   /* public static void Hollow_rectangle(int row,int col)
    {
    	for(int i=1;i<=row;i++)
    	{
    		for(int j=1;j<=col;j++)
    		{
    			if(i==1||i==row||j==1||j==col)
    			{
    				System.out.print("*");
    			}
    			else 
    			{
    				System.out.print(" ");
    			}
    		}
    		System.out.println();
    	}
    }
    public static void main(String args[])
    {
    	Hollow_rectangle(4,5);
    }*/
	
	
	public static int avg(int a,int b,int c)
	{
		int result= a+b+c/3;
		System.out.println(result);
		return 1;
		
	}
	public static void main(String args[])
	{
		//System.out.println(Avg(1,2,3));
		Pattern.avg(1,2,3);
	}
    
}