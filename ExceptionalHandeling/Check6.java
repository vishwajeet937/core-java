class Check6 
{
	private static Logger logger = LogManager.getLogger(Check6.class);
	public void m1()
	{
		throw new Check7("hvh");
		//int a=23;
		//int b=24;
		//System.out.println(a/b);
	}
	public static void main(String[] args) 
	{
		Check6 c=new Check6();
		c.m1();
	}
}
