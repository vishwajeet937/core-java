package com.test;


import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class Test1 
{
	@Test
	public void test()
	{
		int actualVal=LogicRelated.getGreatestNum(new int[] {56,767,3,89,646,6});
		assertEquals(767,actualVal);
	}
	@Test
	public void test1()
	{
		int actualVal=LogicRelated.getSmallestNum(new int[] {56,767,3,89,646,6});
		assertEquals(3,actualVal);
	}
	
}
