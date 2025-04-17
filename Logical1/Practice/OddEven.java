import java.util.Scanner;
class OddEven 
{
	public static void odd()
	{
		int oddNum=10;
		for(int i=0;i<=oddNum;i++)
		{
		  if(i%2==0)
		    {
			  System.out.println("OddNumber is:"+i);
		    }
		}
	}
	public void even(int in)
	{
		//int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the number");
		int num=scan.nextInt();
		for(int j=0;j<=num;j++)
		{
			if(j%2==1)
			 {
				System.out.println("EvenNumber is:"+j);
			 }
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		OddEven.odd();
		
        OddEven oe=new OddEven();
		oe.even(1);
	}
}
