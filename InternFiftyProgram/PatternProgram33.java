class PatternProgram33 
{
	public static void main(String[] args) 
	{
		int size=5;
		for (int i=1 ;i<size+1 ;i++ )
		{
			for (int j=size ;j>i ;j-- )
			{
				System.out.print(" ");
			}
			for (int k=0 ;k<(2*i-1) ;k++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
