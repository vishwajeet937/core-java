import java.util.Scanner;
class CheckPostiveAndNegative7
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
		int num=scan.nextInt();
		if (num<0)
		{
			System.out.println("Negative number is:"+num);
		}
		else if (num>0)
		{
			System.out.println("Postive number is:"+num);
		}
		else 
		{
			System.out.println("Zero number is:"+num);
		} 
	}
}
