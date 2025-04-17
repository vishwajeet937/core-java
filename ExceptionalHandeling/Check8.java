class Check8 
{
  public void m1()
  { 
	  //System.out.println("m1");
	try
	{
		//throw new RuntimeException();
		System.out.println("try");
	}
	catch (Exception e)
	{
		System.out.println("catch");
	}
	finally
	{
		System.out.println("finally");
	}
	/*catch(Exception e)
	  {
		System.out.println("Catch2");
	  }*/
  }
	public static void main(String[] args) 
	{
		Check8 c=new Check8();
		c.m1();
	}
}
