import java.util.Arrays;
class StringProgram1 
{
	public static void main(String[] args) 
	{
		String name="vishhajeit";
		//name=name.concat("-kumar");
           
		try
		{
			int count=1;
			boolean flag=false;

			char[] ch=name.toCharArray();
			for (int i=0 ;i<ch.length ;i++ )
			{
				flag=false;
				for (int j=i+1 ;j<ch.length ;j++ )
				{
					for (int k=j-1 ;k>=0 ;k-- )
					{
						if (ch[k]==ch[j])
						{
							flag=true;
						}
					}
					
					if (ch[i]==ch[j])
					{
						count++;
					}
				}
				 
				if (flag)
					{
						continue;
					}
               System.out.println("No of occrunce: "+ch[i]+" "+count);
			   count=1;
			  
			}
			//boolean b=name.startsWith("v");
			//boolean b=name.contains("jeetyuty");
			//char c=name.charAt(9);
			//System.out.println(c);
			//System.out.println(name);
			//System.out.println(b);
			System.out.println(Arrays.toString(ch));

		}
		catch (StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
	}
}
