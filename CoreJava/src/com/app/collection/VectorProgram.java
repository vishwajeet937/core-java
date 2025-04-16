package com.app.collection;
import java.util.Vector;
public class VectorProgram 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//1.4 style code without generic and AutoBoxing	,AutoUnBoxing for adding and retrieving	
    Vector v=new Vector();// without generic -> param and return type object
    //v.add(new Integer(5),2);
    v.add(125);
    v.add("s");
    v.add('o');
    v.add(671213245675788712l);
    System.out.println(v);
    
    //String s=v.get(0);
    Object obj =v.get(0);
   // String s=(String)obj;
    //System.out.println(s.toUpperCase());
    
       if(obj instanceof String)
         {
            String s=(String)obj;
             System.out.println(s.toUpperCase());
         }
       else 
       {
    	   System.out.println(obj);
       }
       
       Vector<String> v1=new Vector<String>();   //with generic
       //v1.add(5);   //CE:                             //param and return type
       v1.add("StringType");                     //are given type
       v1.add(null);
       System.out.println(v1);
       
     //String s1=v1.get(0);
       Object obj1=v1.get(0);
     //String s1=(String)obj;
     //System.out.println(s1.toUpperCase());
       if(obj instanceof String)
       {
    	   String s1=(String)obj;
    	   System.out.println(s1.toUpperCase());
       }
       else
       {
    	   System.out.println(obj);
       }
       
 //java 5v style code with generic and AutoBoxing ,AutoUnBoxing
       Vector<Integer> v3=new Vector<Integer>();//with generic
       v3.add(3);                               //parem and return type
       //v3.add("dsa");                         //are given type
       System.out.println(v3);
       
       Object obj2=v3.get(0);
       if(obj2 instanceof String)
       System.out.println(((String)obj2).toUpperCase());
       else
        {
    	   System.out.println(obj2);
        }
	}
 
}
