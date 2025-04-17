class Check21 extends Object 
{
	static String collegeName="Orissa Engineering college";
}
class Check22 extends Check21
{
	static String studentName="Vishwajeet kumar";
	int rollNo=164122;
	String branch="CSE";
	public void check22()
	{
		System.out.println(super.collegeName);
		System.out.println(studentName);
		System.out.println(rollNo);
		System.out.println(branch);
	}
	public static void main(String[] args) 
	{
		Check22 c=new Check22();
		c.check22();
	}
}
