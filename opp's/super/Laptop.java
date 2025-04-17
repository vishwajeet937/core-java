class Laptop extends Object 
{
	String personName="vishwajeet kumar";
	int personAge=23;
	long personMobNo=9570381226l;
	public void laptop()
	{
		System.out.println("Laptop");
	}
}
class Phone extends Laptop
	{
	public void phone()
		{
		System.out.println(super.personName+"\n"+super.personAge+"\n"+super.personMobNo);
	    }
	public static void main(String[] args) 
	{
		Phone p=new Phone();
		p.laptop();
		p.phone();
	}
}
