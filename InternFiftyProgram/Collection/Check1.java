class Check1 
{
	public void data(Check c)
	{
	   	System.out.println(c.companyName);
		System.out.println(c.empName);
		System.out.println(c.empId);
	}
	public static void main(String[] args) 
	{
		Check c1=new Check();
		c1.companyName="triniti";
		c1.empName="rohan";
		c1.empId=8943;

		Check1 c2=new Check1();
		c2.data(c1);
         


	}
}
