package com.app.dataType;

public class TypeCasting 
{
	
}
class TypeCasting1 extends TypeCasting
  {
	
  
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=26;
		byte b=(byte)num;
		System.out.println(b);
		
		double balance=5412.2d;
		int i=(int)balance;
		System.out.println(i);
		
		Object obj=new TypeCasting();
		TypeCasting1 t=(TypeCasting1)obj;
		
        TypeCasting tc=new TypeCasting1();
        TypeCasting1 tc1=(TypeCasting1)tc;
        System.out.println(tc1);
        
        
	}

}



/*ComplieTime=> 1) first compiler should be check the is a relationShip checked between 
 * typed casted class and object is there or not.
 * 2)Compiler should be checked the type of type casted class is either same or sub type 
 * of reference variable is there or not.
 * 
 * RunTime=>1)now at the run time jvm should be checked current object class type is same or 
 * sub type of type casted class is there or not.
 */
