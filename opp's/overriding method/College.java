 class College extends Object
{
	String name="Vishwajeet kumar";
	String college="orissa engineering college";
	String branch="Computer Science Engineering";
	int rollNo=164122;
	long redgNo=1601211198;
	public void college()
	{
		System.out.println("Name:"+name+"\n"+"College:"+college+"\n"+"Branch:"+branch+"\n"+"rollNo:"+rollNo+"\n"+"redgNo:"+redgNo);
	}
}
class Home extends College
{
	String name="Sonu kumar";
	String vill="Mahadeopur";
	long mobNo=9570381226l;
     public double name()
	{
		//super.college();
		System.out.println("Name:"+name+"\n"+"vill:"+vill+"\n"+"MobNo:"+mobNo);
		return 2.2;
	}
}
class House extends College
{
}
class ThankYou extends Home
{
	String name=".....Thankyou for Submit.....";
	//@Override
	public int name()
	{
		System.out.println(name);
	return 23;
    }
	public static void main(String[] args) 
	{
	  ThankYou c=new ThankYou();
	  c.college();
	 // c.home();
	  c.name();
	}
}
