package Recursion;

public class CallStack 
{
   public static void printDec(int n)
   {
	   if(n==3)
	   {
		   System.out.println(1);
		   return;
	   }
	   System.out.println(n);
	   printDec(n-1);
   }
	public static void main(String[] args)
	{
		printDec(11);
	}

}
