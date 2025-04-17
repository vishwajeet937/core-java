class School1
{
	public static void main(String[] args) //throws RuntimeException
	{
		try
		{	
			throw new School("school");
		}
		catch (RuntimeException r)
		{
			r.printStackTrace();
		}
		
	}
}
