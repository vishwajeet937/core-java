class Check16 
{
	Check16()
	{  
		System.out.println("Zero parrem constructor");
	}
	Check16(int i)
	{
		System.out.println("one parrem constructor");
	}
	Check16(int i,String s)
	{
       System.out.println("Two parrem constructor");		
	}
	Check16(int i,float f,double d)
	{
		System.out.println("Three parrem constructor");
	}
	Check16(int i,float f,double d,char ch)
	{
		System.out.println("Four parrem constructor");
	}
	Check16(int i,float f,double d,char ch,boolean b)
	{
		System.out.println("Five parrem constructor");
	}
	Check16(int i,float f,double d,char ch,boolean b,String s)
	{
		System.out.println("Six parrem constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
