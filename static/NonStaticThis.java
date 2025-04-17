class NonStaticThis 
{
	int x=10;
	{
		int y=x;
		//System.out.println("y:"+y);
		System.out.println("x:"+x);
	}
	public static void main(String[] args) 
	{
		NonStaticThis n=new NonStaticThis();

		System.out.println("Hello World!");
	}
}
