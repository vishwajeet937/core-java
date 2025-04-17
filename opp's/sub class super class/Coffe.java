class Coffe 
{
	String matterial="suger";
	String matterial1="milk";
	public String coffe()
	{
		System.out.println("Coffe:"+matterial+"-"+matterial1);
		return "matterial";
	}
}
class Tea extends Coffe
{
	String matterial2="suger1";
	String matterial1="chaipati";
	public String tea()
	{
		System.out.println("Tea:"+matterial2+"-"+matterial1);
		return "matterial";
	}
}
class GreenTea extends Tea
{
    public void greenTea()
	{
		System.out.println("GreenTea:"+matterial);
	}
	public static void main(String[] args) 
	{
		GreenTea c=new GreenTea();
		c.coffe();
		c.tea();
		c.greenTea();
	}
}
