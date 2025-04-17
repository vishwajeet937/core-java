class Test28 
{
	 static int i=1;
	public static void main(String[] args) 
	{
		//static int i=1;// static keyword not use in method level.static keyword only class level use
		for (Test28.i=1; Test28.i<10; Test28.i++)
		{
			i=i+2;
			System.out.print(i + " ");
		}
	}
}
