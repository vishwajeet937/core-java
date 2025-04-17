class Father
{
	String name="Sunil kumar singh";
	long mobNo=...................l;
	String vill="mahadeopur";
	public void father()
	{
		System.out.println(name+" "+mobNo+" "+vill)
	}
}
class Sonu extends Father 
{
	String name="Monu kumar";
	long mobNo=9117348233;
	String vill="Mahadeopur";
	public void sonu()
	{
		System.out.println(name+" "+mobNo+" "+vill);
	}
}
class Monu extends Sonu
{
	String name="Sonu kumar";
	long mobNo=9570381226;
	String vill="Mahadeopur";
	public void monu()
	{
		System.out.println(name+" "+mobNo+" "+vill);
	}
	public static void main(String[] args) 
	{
		Monu m=new monu();
		m.monu();
	}
}
