class ReverseString 
{
    public  revrseString(String str)
	{
		char ch[]=str.toCharArray();
		String rev="";
		for (int i=ch.length-1 ;i>=0 ;i-- )
		{
			rev+=ch[i];
		}
		return rev;
	}


	
}
