package com.app.oop;

	abstract class ExampleDemo
	{
	    abstract void m1();
	    abstract void m2();
	}
	abstract class SampleDemo extends ExampleDemo
	  {
		abstract void m3();
		abstract void m4();
	  }
	abstract class XyzDemo extends SampleDemo
	 {
		abstract void m5();

	 }

