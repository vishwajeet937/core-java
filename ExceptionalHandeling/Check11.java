class Check11 
{
	public void m1()
	{
		try
		{
			System.out.println("try");
		}
		finally
		{
			System.out.println("finally");
		}
		try
		{
			System.out.println("try 1");
		}
		catch(Exception e)
		{
			System.out.println("Catch");
		}
	}
	public static void main(String[] args) 
	{
		Check11 c=new Check11();
		c.m1();
	}
}
