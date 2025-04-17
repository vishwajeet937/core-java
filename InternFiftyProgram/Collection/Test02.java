class Test02 
{
	public void cllgData(Test2 t)
	{
		System.out.println(t.cllgName);
		System.out.println(t.rollNo);
		System.out.println(t.redgNo);
		System.out.println(t.state);
	}
	public static void main(String[] args) 
	{
		Test2 t2=new Test2();
		t2.cllgName="Orissa Engineering college";
		t2.rollNo=164122;
		t2.redgNo=160121198l;
		t2.state="Orisha";

		Test02 t02=new Test02();
		t02.cllgData(t2);
	}
}
