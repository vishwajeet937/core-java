public class AKA 
{
	public static final int NUM=11;
	static void positions(String str, int n)
	{
		for(int i=0; i<n; i++)
			System.out.print((str.charAt(i) & NUM) + " ");
		}
	public static void main(String[] args) 
	{
		String str="Geeks";
		int n=str.length();
		positions(str,n);
	}
}
