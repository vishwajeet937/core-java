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
		System.out.println(super.name+"\n"+mobNo);
	}
	public static void main(String[] args) 
	{
		Check19 c=new Check19();
			//c.check18();
			//c.check17();
	}
}
