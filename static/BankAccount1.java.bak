class BankAccount1 
{
	void m1(BankAccount1 account)//Refrence as a parameter
	{
	System.out.println("m1:"+account.hashCode());	
	}
	BankAccount1 m2()
	{
		System.out.println("m2:");
		//BankAccount1 b1=new BankAccount1();
		//return b1;
		return this;
		//return new BankAccount1();
	}
	void m3(String[] personNames)
	{
		System.out.println("m3:"+java.util.Arrays.toString(personNames));
	}
	public static void main(String[] args) 
	{
		BankAccount1 b=new BankAccount1();
		//BankAccount1 b1=new BankAccount1();
		b.m1(new BankAccount1());
		b.m1(b);
		System.out.println("Hello World!");
		b.m2();
		String[] arr=new String[]{"sonu","monu"};
		b.m3(arr);
	}
}
