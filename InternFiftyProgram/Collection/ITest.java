 
interface ITest
{

	public void m1();
}
class Test1 
{
	public void run(){
		System.out.println("run method");
	}
}
	public static void main(String[] args) 
	{
		ITest it=new Test()::run;
	}
}
