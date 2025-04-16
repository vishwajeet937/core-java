package Loop_FlowControl;

public class BreakStatement
{

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==3)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("i'm out of the loop");

	}

}
