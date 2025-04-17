class Demo 
{
	public static void main(String[] args)throws Exception 
	{
		try{
			System.out.println("try");
			throw new Exception();
			//System.out.println("try");
			
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally
			{
				System.out.println("finally");
			}
	}
}
