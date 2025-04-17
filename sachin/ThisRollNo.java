class ThisRollNO 
{
	int rollNo;
	public void m1(int rollNo)
	{
		if(rollNo==0)
		{
			System.out.println("donot pass value Zero");
		}
		else if(rollNo<0)
		{
			System.out.println("donot pass -ve number");
		}
		this.rollNo;
	}
	public static void main(String[] args) 
	{
		System.out.println("output start");
		ThisRollNo t=new ThisRollNo();
		t.m1(896);
	}
}
