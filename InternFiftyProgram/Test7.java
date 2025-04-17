class Test7 
{
	public static void main(String[] args) 
	{
		String name="vishwajeet kumar";
		int length=name.length();
		String rev=" ";
		for (int i=length-1 ;i>=0 ;i-- )
		{
			rev=rev+name.charAt(i);
		}
		System.out.println(rev);
		
	}
}
