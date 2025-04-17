class ReturnRollNo
{
	int rollNo;
	public int m1()
	{
		System.out.println("m1");
		return rollNo;
	}
	public static void main(String[] args) 
	{
		System.out.println("main method 1");
		ReturnRollNo r=new ReturnRollNo();
		r.m1();
		System.out.println("main method 2");
	}
}
