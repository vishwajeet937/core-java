class Check 
{
	Check()
	{
		System.out.println("check constructor");
	}
	public static void main(String[] args) 
	{
		String name="nbhkb";
		//new String(new char[]{'n','b','h','k','b'});
	     String name1="nbhkb";
		//String name=new String(new String(new char[]{'b','c','v','b'}));
	//System.out.println(name.hashCode());
	//System.out.println(name1.hashCode());
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(name1));
	}
}
