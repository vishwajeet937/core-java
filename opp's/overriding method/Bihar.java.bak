class Bihar extends Object 
{
	String state;
    public Object bihar()
	{
		System.out.println("Bihar:"+state);
		return new Mahadeopur();
	}
}
class Patna extends Bihar
{
	String capital;
	@Override
	public Integer bihar()
	{
		System.out.println("Patna:"+capital);
		return 34;
	}
}
class Masaurhi extends Patna
{
	String postOffice;
	String policeStation;
	//@Override
	public String masaurhi()
	{
		System.out.println("Masaurhi:"+postOffice+" "+"Masaurhi:"+policeStation);
		return "ssgg";
	}
}
class Mahadeopur extends Masaurhi
{
	String vill;
	@Override
	public Integer bihar()
	{
		System.out.println("Mahadeopur:"+vill);
		return 34;
	}
	public static void main(String[] args) 
	{
		Mahadeopur m=new Mahadeopur();
		m.bihar();
		m.masaurhi();
		//m.Patna();
	}
}
