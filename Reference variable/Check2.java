class Check2 
{
	String name;
	String email;
	String addresh;
	long phoneNo;
	String comment;
	 static
	{
		System.out.println("Contect information");
	}
	public String name()
	{
		System.out.println("name:"+name+"............");
		return "vishwajeet";
	}
	public String email()
	{
		System.out.println("email:"+email+"..........");
		return email;
	}
	public String adderesh()
	{
		System.out.println("addresh:"+addresh+"..........");
		return "visheajeet";
	}
	public long phoneNo()
	{
		System.out.println("phoneNo:"+phoneNo+"...........");
		return phoneNo;
	}
	public String comment()
	{
		System.out.println("comment:"+comment+"...........");
		return "vishwajeet";
	}
	 static public void main(String[] args) 
	{
		Check2 c=new Check2();
		c.name();
		c.email();
		c.adderesh();
		c.phoneNo();
		c.comment();
	}
}
