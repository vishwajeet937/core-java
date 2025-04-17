class Check
{
	String personName="vishwajeet";
	int personAge=23;
	public String check()
    {
		String personName="sonu";
		int personAge=24;
		System.out.println("personName:"+personName+"\n"+"personAge:"+personAge);
		System.out.println("personName:"+this.personName+"\n"+"personAge:"+this.personAge);
		return "monu";
    }
	Check()
	{
		this(1);
		System.out.println("constructor");
	}
	Check(int i)
	{
		System.out.println("parrameter constructor");
	}
}
class Check1 extends Check
{
	Check1()
	{
		System.out.println("constructor in check1 class");
	}
	public static void main(String[] args) 
	{
		Check1 c=new Check1();
		c.check();
	}
}
