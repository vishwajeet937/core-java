package whileloop;

public class WhileLoopStatements 
{
	public static void main(String[] args) {
		LambdaExpression.check();
	} 
	public static void check() {
		System.out.println("testing check() method");
	}
	
	public void whileCondition()
	{
		int number = 10;
		
		int i = 1;
		
		System.out.println("Start");

		while(i <= number)
		{
			System.out.println("i value is : " + 10);
			i++;
		}
		
		System.out.println("Done");
	}

	public void whileWithIfElseCondition()
	{
		int number = 10;
		
		int i = 1;
		
		System.out.println("Start");

		while(i <= number)
		{
			if(number == 10)
			{
				System.out.println("number value is 10");
			}
			else
			{
				System.out.println("number value is not 10");
			}
			
			i++;
		}
		
		System.out.println("Done");
	}
}