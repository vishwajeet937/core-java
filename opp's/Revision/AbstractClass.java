abstract class AbstractClass 
{
	AbstractClass()
	{
		System.out.println("constructor");
	}
	abstract public void m1();
  
  }
  class Check extends AbstractClass
  {
	  public void m1()
	  {
		
	  }
	public static void main(String[] args) 
	{
		Check c=new Check();
		System.out.println("Hello World!");
	}
}
