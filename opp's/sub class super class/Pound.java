class Pound
{
	String pondName;
	int noOfPartner;
	String branch;
    String seedCapsity;
    static
	{
		System.out.println("........fish farm.........");
	}
	public int noOfPartner()
	{
		int noOfPartner=3;
		System.out.println("noOfPound:"+noOfPartner);
		return noOfPartner;
	}
	public void branch()
	{
		int branch=3;
		System.out.println("Branch:"+branch);
	}
		public void seedCapsity()
		{
			double seedCapsity=1.5d;
			System.out.println("SeedCapsity:"+seedCapsity);
		}
	public static void main(String[] args) 
	{
		Pound p=new Pound();
		p.noOfPartner();
		p.branch();
		p.seedCapsity();
	}
}
