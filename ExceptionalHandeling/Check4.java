class  Check4 
{
	int i=54;
	int j=0;
	public void m1()//throws RuntimeException
	{
		//throws new Exception();
		try
		{
		throw new RuntimeException();	
		}
		catch (RuntimeException e)
		{
			System.out.println("catch1");
		}
		System.out.println(i/j);
	}
	public static void main(String[] args) //throws RuntimeException,Exception
	{
		Check4 c=new Check4();
		try
		{
			c.m1();
		}
		catch (NullPointerException e)
		{
			System.out.println("catch");
		}
		catch(RuntimeException e1)
		{
			System.out.println("catch2");
		}
	}
}
