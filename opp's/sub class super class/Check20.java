class Check17 extends Object 
{
	public void check17()
	{
		System.out.println("Check17");
	}
}
class Check18 extends Check17
{
	String name="Sonu";
	public String check18()
	{
		System.out.println(name);
		return "jdhf";
	}
}
class Check19 extends Check18 
{
	long mobNo=9570381226l;
	public void mobNo()
	{
		long mobNo=75767546l;
		System.out.println(super.name+"\n"+this.mobNo);
	}
}
class Check20 extends Check19
{
	int age=23;
	void check20()
	{
		System.out.println(age);
		age=24;
		System.out.println(age);
	}
	public static void main(String[] args) 
	{
		Check20 c=new Check20();
			c.check18();
			c.check17();
			c.mobNo();
	}
}
