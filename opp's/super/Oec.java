class Oec
{
	String collegeName="Orissa engineering college";
    public void college()
	{
		System.out.println(collegeName);
	}
}
class StudentName extends Oec
{
	String studentName="vishwajeet kumar";
	String branch="CSE";	
	long redgNo=1601211198l;
	public void student()
	{
		String collegeName="GEC";
		System.out.println(collegeName+"\n"+studentName+"\n"+branch+"\n"+redgNo);
	}
}
class StudentName1 extends StudentName
{
	String studentName="Sachin kumar";
	long redgNo=83475753465l;
	String branch="It";
	public void studentDetails()
	{
		System.out.println(collegeName+"\n"+studentName+"\n"+super.branch+"\n"+redgNo);
	}
	public static void main(String[] args) 
	{
		StudentName1 s=new StudentName1();
		s.studentDetails();
	}
}
