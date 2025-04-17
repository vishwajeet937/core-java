class ExceptionProgram 
{ 
	int i=298;
	int j=0;
	public static void main(String[] args) 
	{
		try
		{
		   System.ot.println(i/j);	
		}
		catch (Exception e)
		{
			System.out.println("Catch");
		}
		System.out.println("Hello World!");
	}
}
