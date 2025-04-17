class ReturnCheck2 
{
	String name="Vishwajeet kumar";
	long mobNo=9570381226L;
	String vill="Mahadeopur";
	public String name()
	{
		System.out.println(name);
		return name;
	}
	public long mobNo()
	{
		System.out.println(mobNo);
		return mobNo;
	}
	public String vill()
	{
		System.out.println(vill);
		return vill;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		ReturnCheck2 r=new ReturnCheck2();
		r.name();
		r.mobNo();
		r.vill();
	}
}
