class Father
{
	String name="Sunil kumar singh";
	long mobNo=889457684l;
	String vill="mahadeopur";
	public void father()
	{
		System.out.println(name+"\n"+mobNo+"\n"+vill);
	}
}
class Sonu extends Father 
{
	String name="sonu kumar";
	long mobNo=9117348233l;
	String vill="Mahadeopur";
	public void sonu()
	{
		System.out.println(name+"\n"+mobNo+"\n"+vill);
	}
}
class Monu extends Sonu
{
	String name="monu kumar";
	long mobNo=9570381226l;
	String vill="Mahadeopur";
	public void monu()
	{
		System.out.println(name+"\n"+mobNo+"\n"+vill);
	}
	public static void main(String[] args) 
	{
		Monu m=new Monu();
		m.monu();
	}
}
