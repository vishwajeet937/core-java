import java.util.List;
import java.util.ArrayList;
class ForEachMethod 
{
	public static void main(String[] args) 
	{
		List<String> l1=new ArrayList<String>();
		l1.add("m1");
		l1.add("m2");
		l1.add("m3");
		l1.add("m4");
          System.out.println(".........");
		//l1.forEach(l->System.out.println(l));//Iterating by passing lambda expression
		l1.forEach(System.out::println);//Iterating by passing method reference
	}
}
