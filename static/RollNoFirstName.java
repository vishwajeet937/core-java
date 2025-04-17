class RollNoFirstName 
{
	int rollNo;
	String fName;
	public int m1()
	{
		System.out.println("m1");
		return rollNo;
	}
	public String m2()
	{
		System.out.println("m2");
		return fName;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method 1");
		RollNoFirstName r=new RollNoFirstName();
		r.m1();
		r.m2();
		System.out.println("main method 2");
	}
}
