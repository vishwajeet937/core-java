class MyAddreshProject 
{
	String name;
	long mobNo;
	String village;
	//String p.s+p.o;
	String distic;
	int pinCode;
	String state;
	String country;
	public String m1()
	{
		System.out.println("Name"+"="+"Sonu"+" "+"Kumar");
		return name;
	}
	public long m2()
	{
		System.out.println("MobNo"+"="+9570381226L);
		return mobNo;
	}
	public String m3()
	{
		System.out.println("village"+"="+"Mahadeopur");
		return village;
	}
	/*public String m4()
	{
	   System.out.println("Masaurhi");
	   return p.o+p.s;
	}*/
	public String m5()
	{
		System.out.println("Distic"+"="+"Patna");
		return distic;
	}
	public int m6()
	{
		System.out.println("PinCode"+"="+804452);
		return pinCode;
	}
	public String m7()
	{
		System.out.println("State"+"="+"i"+" "+"am"+" "+"Bihari");
		return state;
	}
	public String m8()
	{
		System.out.println("Country"+"="+"india");
		return country;
	}
	public static void main(String[] args) 
	{
		System.out.println("My Addresh");
		MyAddreshProject p=new MyAddreshProject();
		p.m1();
		p.m2();
		p.m3();
		//p.m4();
		p.m5();
		p.m6();
		p.m7();
		p.m8();
	}
}
