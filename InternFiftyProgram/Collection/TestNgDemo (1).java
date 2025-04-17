package com.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgDemo {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("---before suite---");
	}	
	
	@Parameters({"name","id","dept"})
	@Test(priority = 2)
	public void test(@Optional("NA")String empName,@Optional("100")int empId,@Optional("java-Dev") String empDept) {
		System.out.println("name: "+empName+"\t"+"id: "+empId+"\t"+empDept);
		
	}
	
	@DataProvider(name = "dp")
	public Object[][] provideData(){
		return new Object[][] {{"triniti",new Integer(250),new TestNgDemo()},{"trinti",105,new TestNgDemo()}};
	}
	
	@Test(dataProvider = "dp",priority = 1)
	public void testDataProvider(String name,int id,TestNgDemo testNg) {
		System.out.println("name01: "+name+"\n"+"id01: "+id+"\n"+"refHashCode: "+testNg.hashCode());
		assertEquals(id, testNg.hashCode());
	}
	
	@Test(priority =4)
	public void idTest() {
		System.out.println("idTest");
	}
	
	@Test(priority = 3)
	public void nameTest() {
		System.out.println("nameTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("---after suite---");
	}
	
}
