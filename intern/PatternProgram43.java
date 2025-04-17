class PatternProgram43 
{
	public static void main(String[] args) 
	{
		int column=1;
		int rows=6;
         
		
		for (int i=0 ;i<rows ;i++ )
		{
			for (int space=1 ;space<rows-1 ;space++ )
			{
				System.out.print(" ");
			}
			for (int j=0 ;j<=i ;j++ )
			{
				if (j==0||i==0)
				{
					column=1;
				}
				else
					column=column*(i-j+1)/j;
				System.out.print(" "+column);
			}
			System.out.println();
		}
	}
}
