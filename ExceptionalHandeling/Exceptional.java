class ExceptionHandling
{
	public void m1() throws ArrayIndexOutOfBoundsException
		{
			System.out.println("m1");
			System.out.println("m2");
			int[] arr=new int[5];
			//try
			//{
				//String val=null;
				//val.toString();
				System.out.println("456");
				System.out.println(arr[9]);
				System.out.println("123");
				System.out.println("456");
			//}
			//catch (Exception a)
			//{
				//a.printStackTrace();
				
			//}
			System.out.println("m3");
			System.out.println("m4");
			//m2();
		}
		public void m2()
		{
			m1();
			System.out.println("m2 method");
		}
	public static void main(String[] args) 
	{	
		System.out.println("Hello World!");
		ExceptionHandling e=new ExceptionHandling();
		try
		{
	      //e.m1();
		  e.m2();
		  System.out.println("bvhbfhvb");
		}
		catch (ArrayIndexOutOfBoundsException a)
		{
       System.out.println("Exception rise");
		}
		catch(java.lang.NullPointerException b)
		{
			 System.out.println("NullPointerException");
		}
		finally
			{
				System.out.println("finnaly block");
			}
	}
}

