class College 
{
	private int id;
	private String name;
	private String location;
	private Student st;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setLocation(String location)
	{
		this.location=location;
	}
	public void setSt(Student st)
	{
		 this.st=st;
	}

	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public String getLocation()
	{
		return this.location;
	}
	public Student getSt()
	{
		return this.st;
	}
}
