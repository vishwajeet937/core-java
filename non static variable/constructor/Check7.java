class Check 
{
	int i=37;
	Check7(int i)
	{
       this.i=i;
		System.out.println("Zero parrem Constructor:");
	}
	public static void main(String[] args) 
	{
		System.out.println("output Start");
		Check7 c=new Check7();
		//ConstructorCall.i();
		System.out.println("i:"+c.i);
	}
}
