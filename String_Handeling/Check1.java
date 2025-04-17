class Check1 
{
	@Override
	public int hashCode()
	{
		return 12;
	}
	Check c;
	Check1(Check c)
	{
		this.c=c;
	   System.out.println("fdsvcbdbnnxbcxzz"+(c.hashCode()));	
	}
	public static void main(String[] args) 
	{
		Check1 c=new Check1(new Check());
		Check1 c1=new Check1(new Check());
		//System.out.println(c.hashCode());
		//System.out.println(c1.hashCode());
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(c1));
		//c.Check1(c);
	}
}
//System.identityHashCode()