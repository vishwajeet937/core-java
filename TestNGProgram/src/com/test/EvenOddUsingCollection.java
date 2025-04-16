
package com.test;
import java.util.ArrayList;

public class EvenOddUsingCollection
{
	public static ArrayList odd(ArrayList<Integer> arr)
	{
    ArrayList<Integer> oddAl=new ArrayList<>();
    for(int i=0;i<arr.size();i++)
    {
    	if(arr.get(i)%2!=1)
    	{
    		oddAl.add(arr.get(i));
    	}
    	
    }
    return oddAl;
	}
	
}
