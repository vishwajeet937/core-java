class Room 
{
	public static void m1()
	{
		
	}
}
class Test extends Room
{
	public static void m1()
	{
		
	}
}
	public static void main(String[] args) 
	{
		Room t=new Test();
		t.m1();
		System.out.println("Hello World!");
	}
}
