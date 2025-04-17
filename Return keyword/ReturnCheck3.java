class ReturnCheck3 
{
	String name="Sonu";
	int houseNo=12;
	String vill="Mahadeopur";
	public String name()
	{
		System.out.println(name);
		return name;
	}
	public int houseNo()
	{
		System.out.println(houseNo);
		return houseNo;
	}
	public String vill()
	{
		System.out.println(vill);
		return vill;
	}
	public int m1()
	{
		System.out.println(houseNo);
		return houseNo;
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ReturnCheck3 r=new ReturnCheck3();
		r.name();
		r.houseNo();
		r.vill();
		r.m1();
	}
}
