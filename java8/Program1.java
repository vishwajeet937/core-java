import java.util.function.Function;
class Program1 
{
	public static void main(String[] args) 
	{
		//System.out.println("java-8 Feature");
		Function<Integer,Integer>f=i->i*i;
		System.out.println("The Square of 4:"+f.apply(40));
		System.out.println("The square of 5:"+f.apply(50));
	}
}
