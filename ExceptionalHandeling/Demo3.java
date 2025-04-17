class Demo3 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("try1");
			throw new Exception();
		}
		catch (Exception e)
		{
			System.out.println("catch1");
			e.printStackTrace();
		}
		try
		{
			System.out.println("try2");
		}
		
		catch (Exception e)
		{
             System.out.println("catch");
		}
		System.out.println("Hello World!");
	}
}
