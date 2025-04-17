class Test5 
{
     static String companyName="TRINITI";
	 String empName="Vishwajeet kumar";
	public void m1()
	{
		System.out.println(companyName);
	    System.out.println(empName);
	}
	 public static int m2()
	 
	{
		System.out.println(companyName);
		//System.out.println(empName);
		return 2;
	}
	static int m3()
	{
		try
		{
			
			System.out.println("try");
			System.out.println(10/0);
			
			return 10;
		}
		catch (Exception e)
		{
			//e.printStackTrace();
			System.out.println("catch");
			return 20;
		}
		finally
		{
			System.out.println("finally");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Test5 t=new Test5();
		t.m1();
		t.m2();
		t.m3();
	}
}
