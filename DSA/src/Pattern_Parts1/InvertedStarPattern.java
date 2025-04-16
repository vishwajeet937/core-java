package Pattern_Parts1;

public class InvertedStarPattern
{

	public static void main(String[] args)
	{
		int num=4;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num-i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
