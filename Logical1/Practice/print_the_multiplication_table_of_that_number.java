import java.util.Scanner;
class print_the_multiplication_table_of_that_number
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the number");
        int postiveNumber=scan.nextInt();
        int multiplication=1;
		int result;
		//int i=1;
        //for(int i=1;i<=10;i++)
			while(multiplication<=10)
		{
			result=postiveNumber*multiplication;
          //  postiveNumber++;
		  multiplication++;
		  System.out.println("multiplaction table is:"+result);
		}   			
	}
}
