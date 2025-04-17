class Check18 
{
	String personName="Sonu";
	int personAge=24;
	long mobNo=9570381226l;
	Check18(int personName,String personAge)
	{
		this(4243454543l);
		System.out.println(this.personName+"\n"+this.personAge);
	}
	Check18(long mobNo)
	{
	    mobNo=12345667l;
		System.out.println(mobNo+"\n"+this.mobNo);
	}
	public static void main(String[] args) 
	{
		Check18 c=new Check18(24,"rgf");
	}
}
