class Test42 
{
	int i=32;
	String s="sonu";
	/*Test42 ()
	{
		System.out.println("constructor 01");
	}*/
	static
	{
		System.out.println("static block 01 42");
	}
	/*Test42 ()
	{
		System.out.println("constructor 02");
	}*/
	// static String name=m1();
	{
		System.out.println("non static block 01 42");
	}
	static 
	{
		System.out.println("static block 02 42");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method 42");
		Test42 t1=new Test42();
	}
	static 
	{
		System.out.println("static block 03 42");
	}
	{
		System.out.println("non static block 02 42");
	}
	Test42(int i,String s)
	{
		System.out.println(i+""+"s");
		System.out.println("constructor 03 42");
	}
	Test42()
	{
		
	}
}
