package Functions$Methods;

public class FactorialProgram
{
    public static int factorial(int n)
    {
    	int fact=1;
    	for(int i=0;i<=n;i++)
    	{
    	  fact=fact*i;	
    	}
    	return fact;
    }

	public static void main(String[] args)
	{
             System.out.println(factorial(8));
		//FactorialProgram.factorial(1);
	}

}
