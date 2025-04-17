import java.util.Scanner;
public class Check1
{
public static void main(String[] args) 
{
  /*for (int i=0;i<=9;i++)
  {
	  System.out.println(i);
  }*/
	/*int i=0;
  while(i<=9)
  {
	  System.out.println(i);
	  i++;
  }*/
	int i=9;
	do 
	{
	System.out.println(i);
	i++;
	}
	while(i<=8);
	Scanner scan=new Scanner(System.in);
	int j=scan.nextInt();
	if(j%2==0)
	{
		System.out.println("Even number");
	}
	else 
	{
		System.out.println("odd number");
	}

	
}

}
