class Check13 
{
	static int x=33;
	char ch='S';
	static double d=12.2d;
	boolean b=true;
	String s="Sonu";
	Check13()
	{
		this('S',976.977d);
		System.out.println("Zero parrem constructor:"+x);
		//this.d=d;
	}
	Check13(char ch,double d)
	{
		this(true,"janu");
		System.out.println("Two parrem constructor:"+d);
	}
	Check13(boolean b,String s)
	{
		System.out.println("last line parrem constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		Check13 c=new Check13();
		System.out.println("ch:"+c.ch);
		System.out.println("d:"+c.d);
	}
}
