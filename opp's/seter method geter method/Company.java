class Company 
{
   private String name="Triniti";
   private String location="Hyderabad";
   private int noOfBranch=3;
   private int noOfEmploye=300;
    public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	public static void main(String[] args) 
	{
		Company c=new Company();
		c.setName("Amazon");
		String val=c.getName();
		System.out.println(val);
	}
}
