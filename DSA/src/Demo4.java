
public class Demo4
{
   static
   {
	   int meal=5;
	   int tip=2;
	   int total=meal+(meal>6? ++tip : --tip);
	   System.out.println(total);
   }
   static 
   {
	   int a=10;
	   System.out.println(a--*a--);
   }
	public static void main(String[] args)
	{
		int x=5;
		x*=(3+7);
		System.out.println(x);
		
		//int ++a=100;  ce
		
		int i;
		for(int i1=1;i1<6;i1++)
		{
			if(i1>3)
			{
				continue;
			}
			System.out.println(i1);
		}
		

	}

}
