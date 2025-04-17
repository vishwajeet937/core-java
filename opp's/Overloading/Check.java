class Check 
{
	public void main()
	{
		System.out.println("first");
	}
	public void main(int i)
	{
		System.out.println("Second");
	}
	public static void main(String[] args) 
	{
		Check c=new Check();
		c.main(13);
	}
}
