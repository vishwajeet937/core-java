class Check17
{
	Check17()
	{
		System.out.println("Zero parrem");
	}
	Check17(int i,float f)
	{
		System.out.println("Two parrem Constructor");
	}
	Check17(int i,double d,char ch)
	{
		System.out.println("Three parrem Constructor");
	}
	public static void main(String[] args) 
	{
		Check17 c=new Check17();
	}
}
