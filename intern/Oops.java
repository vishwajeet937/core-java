class Oops 
{
	//@Override
	public void triniti()
	{
		String compnyName="Triniti";
		String location="Rasulpura";
		System.out.println("CompnyName:"+compnyName+"\n"+"Location:"+location);
	}
}
class Oops1 extends Oops
{
	@Override
	public void triniti()
	{
		
		String employeeName="Vishwajeet Kumar";
		int empId=20;
		System.out.println("EmployeeName:"+employeeName+"\n"+"EmpId:"+empId);
	}
}
class Oops2 extends Oops1
{
	@Override
	public void triniti()
	{
		String employeeName="Sachin kumar";
		int empId=1;
		System.out.println("EmployeeName:"+employeeName+"\n"+"EmpId:"+empId);
	}

	public static void main(String[] args) 
	{
		Oops2 o=new Oops2();
		o.triniti();
	}
}
