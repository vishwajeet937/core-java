import java.util.ArrayList;
import java.util.Iterator;
class IteratorProgram 
{
	public static void main(String[] args) 
	{
		ArrayList<String> cityNames=new ArrayList<String>();
		cityNames.add("abc");
		cityNames.add("def");
		cityNames.add("ghi");
		cityNames.add("jkl");

		Iterator iterator=cityNames.iterator();
		System.out.println("cityName elements");

		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		System.out.println();
		}
	}
}
