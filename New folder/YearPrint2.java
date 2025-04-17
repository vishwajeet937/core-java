import java.util.Scanner;
class YearPrint2 
{
	public static void main(String[] args) 
	{
	  Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int i=scan.nextInt();
		//System.out.println("");
		//int j=scan.nextInt("");
		if(i==1)
		{
			System.out.println("january");
		}
		else if(i==2)
		{
			System.out.println("febuary");
		}
		else if(i==3)
		{
			System.out.println("march");
		}
		else if(i==4)
		{
			System.out.println("april");
		}
		else if(i==5)
		{
			System.out.println("may");
		}
		else if(i==6)
		{
			System.out.println("jun");
		}
		else if(i==7)
		{
			System.out.println("july");
		}
		else if(i==8)
		{
			System.out.println("Augest");
		}
		else if(i==9)
		{
			System.out.println("September");
		}
		else if(i==10)
		{
			System.out.println("octover");
		}
		else if(i==11)
		{
			System.out.println("November");
		}
		else if(i==12)
		{
			System.out.println("December");
		}
		else
			{
				System.out.println("please Enter the value in 1 to 12");
			}
	}
}
