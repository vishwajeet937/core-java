class Concreat extends Object 
{
    public void concreat()
	{
		System.out.println("concreat");
	}
}
class College extends Concreat
{
	public void college()
	{
		System.out.println("college");
	}
	public static void main(String[] args) 
	{
	College c=new College();
	c.concreat();
	c.college();
	}
}
