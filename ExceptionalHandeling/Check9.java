class Check9 
{
	public void m1()
	{
		try
		{
		  System.out.println("try");
		}
		int a=34;
		catch (Exception e)
		{
			System.out.println("catch");
		}
		int b=45;
		finally
			{
				System.out.println("finally");
			}
	}
	public static void main(String[] args) 
	{
		Check9 c=new Check9();
		c.m1();
	}
}
/////////////////////////wrong statement code//////////////////////////////////////
