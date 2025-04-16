package com.test;

import static org.testng.Assert.assertEquals;

public class Test {

	@org.testng.annotations.Test
	public void test() {
		assertEquals(12, 13);
		
	}
	
	@org.testng.annotations.Test
	public void test01() {
		assertEquals(12, 12);
		
	}
}
