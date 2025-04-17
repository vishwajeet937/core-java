import java.util.Arrays;
class Check10 implements Cloneable
{
	int i;
	//double d;
	private Check10(int i)
	{
		//i=34;//local variable
		//this(90);
		//this.i=i;
		System.out.println("i:"+this.i);
	}
	public static void main(String[] args)throws Exception 
	{
		System.out.println("out put Start");
		System.out.println(Arrays.toString(args));
		Check10 c=new Check10(2);
		c.i=50;
		System.out.println(c.i+";"+c.hashCode());
	Check10 c1=(Check10)c.clone();
	System.out.println(c1.i+";"+c1.hashCode());
	}
}
