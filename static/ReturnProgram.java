class ReturnProgram 
{
	 double balance;
	public double Balance()
	{
		System.out.println("Balance");
		return balance;
	}
	public static void main(String[] args) 
	{
		ReturnProgram r=new ReturnProgram();
		r.Balance();
		System.out.println("Hello World!");
	}
}
