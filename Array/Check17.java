class Check17 
{
	int i=23;
	public static void m1(Check17 c)
	{
		System.out.println("m1:"+c.i);
	}
	public static void main(String[] args) 
	{
		int[] i=new int[8];
		Check17 c=new Check17();
		//c.m1(c);
		c.m1(c[2]);
		System.out.println("Hello World!");
	}
}
