package Functions$Methods;

public class MultiPly
{
    public static int multi(int a,int b)
    {
    	int product=a*b;
    	return product;
    }
	public static void main(String[] args) 
	{
         int a=3;
         int b=7;
         int prod=multi(a,b);
         System.out.println("a*b="+prod);
	}

}
