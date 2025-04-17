import java.util.Set;
import java.util.LinkedHashSet;
class SetProgram 
{
	public static void main(String[] args) 
	{
		String name="hqdhb";
		char[] ch=name.toCharArray();
		Set<Character> s=new LinkedHashSet<Character>();
		s.add=('h');
		s.add=('q');
		s.add=('d');
		s.add=('h');
		s.add=('b');
		System.out.println(s);
	}


	/*public static void main(String[] args)
	{
		Set<Integer> s1=new LinkedHashSet<Integer>();
		s1.add(12);
		s1.add(13);
		s1.add(14);
		s1.add(15);
        System.out.println(s1);

	}*/
}
