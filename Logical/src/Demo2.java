
public class Demo2
{
public static void main(String[] args) 
{
	int i=100;
	
	try
	{
		if (i%2==0)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println(i);
		}
	}
	catch (ArithmeticException e)
	{
       System.out.println("oddNumber");
	}
}

}
