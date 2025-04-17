class Person 
{
	int eyes=2;
	int ears=2;
	int hands=2;
	int legs=2;
	String name;
	double height;
	double weight;
	Person(String name,double height,double weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Person p=new Person("bgf",5.5,33);
	}
}
