class Check2 extends Object 
{ 
	Check2()
	{
		System.out.println("Zero parrem constructor");
	}
}
class Check3 extends Check2
{
	int i=10;
	Check3(int i)
	{
		super();
		System.out.println(i);
	}
}
class Check4 extends Check3
{
	String name="sonu";
	boolean b=true;
	Check4(String s,boolean b)
	{
		super(134);
		System.out.println("name"+name+"/n"+"b:"+b);
	}
	public static void main(String[] args) 
	{
		Check4 c=new Check4("dfd",true);
	}
}
