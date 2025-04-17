import java.util.Arrays;
class String1 
{
	public static void main(String[] args) 
	{
		String name="jbjb";
		
		//char[] ch=name.toCharArray();
		String[] ch=name.split("");
		//System.out.println(ch.length);
		System.out.println(Arrays.toString(ch));

	}
}
