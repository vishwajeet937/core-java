abstract class Vishwajeet 
{
	public abstract void vishwajeet();
	public void sonu()
	{
		System.out.println("sonu");
	}
	Vishwajeet()
	{
		System.out.println("constructor of vishwajeet");
	}
}
class Monu extends Vishwajeet
{
  public void monu()
	{
		System.out.println("monu");
	}
	public static void main(String[] args) 
	{
		Vishwajeet m=new Vishwajeet();
		m.monu();
	}
}
