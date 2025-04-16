package com.app.collection;

import java.util.ArrayList;

public class TestArraysList
{

	public static void main(String[] args)
	{
		int storeVal=0;
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList();
		al.add(6);
		al.add(89);
		al.add(2);
		al.add(101);
		for(int i=0;i<al.size();i++)
		{
			for(int j=i+1;j<al.size();j++) 
			{
				if(al.get(i)<al.get(j))
				{
					storeVal=al.get(i);
					al.set(i,al.get(j));
					al.set(j,storeVal);
				}
					
				
			}
			
		}
		System.out.println(al);
		/*for(Integer i:al)            //foreachLoop
		{
		System.out.println(al);
		}*/
	}

}
