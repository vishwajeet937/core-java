class Parrent extends Object
{
	int Payment=501;
	public int Payment()
	{
		System.out.println("Payment:"+Payment);
		return Payment;
	}
}
	abstract class Child extends Parrent
	{
		long mobNo=9570381226l;
		public long mobNo()
		{
		System.out.println("MobNo:"+mobNo);
		return mobNo;
		}
		static
		{
			System.out.println("static");
		}
	}
	class Kid extends Child
	{
		String name="Vishwajeet Kumar";
		public String name()
		{
			System.out.println("Name:"+name);
			return name;
		}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//Parrent p=new Parrent();
		//p.Payment();
		//p.name();// wrong calling
		//Child c=new Child();
		//c.m1();
		//c.Payment();
		Kid k=new Kid();
		k.name();
		k.mobNo();
		k.Payment();
	}
}
