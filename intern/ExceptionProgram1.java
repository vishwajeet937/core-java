class ExceptionProgram1 
{
	public static void main(String[] args) 
	{
		try
		{
			 for(int i=0 ;i<=100 ;i++ )
			{
				if (i%2==0)
				{
					System.out.println(i);
				}
				else 
				{
					System.out.println();
				}
			}
		}
		catch (Exception e)
		{
		}
		System.out.println("Hello World!");
	}
}
