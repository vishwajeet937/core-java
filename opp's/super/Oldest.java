class Oldest extends Object 
{
	String personName="ram";
	int personAge=79;
	Oldest(String s,int i)
	{
      System.out.println(this.personName+"\n"+this.personAge);
	}
}
class Youngest extends Oldest
      {
        Youngest()
		  {
			 super("sg",33);
			System.out.println("Zero-pearrem constructor");
		  }
      }
class Child extends Youngest
       {
		   Child(String name,int age)
		   {
			   super();
			   name="Janu kumar";
			   age=15;
			System.out.println(super.personName+"\n"+age);
		   }
	public static void main(String[] args) 
	{
		Child c=new Child("gsg",53);
	}
}
