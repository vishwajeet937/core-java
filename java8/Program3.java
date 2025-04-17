
	interface Interf
	{
		public void m1();

	}
	class Demo implements Interf
	{
		public void m1()
		{
			System.out.println("Hi..........");
		}
	}
class Test
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo d=new Demo();
		d.m1();

	}

}