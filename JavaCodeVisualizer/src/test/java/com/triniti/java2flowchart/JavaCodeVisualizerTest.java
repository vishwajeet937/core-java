package com.triniti.java2flowchart;

import com.triniti.java2flowchart.main.JavaCodeVisualizer;

import junit.framework.TestCase;

public class JavaCodeVisualizerTest extends TestCase {

	private JavaCodeVisualizer codeVisualizer;
	
	protected void setUp() throws Exception 
	{
		codeVisualizer = new JavaCodeVisualizer();
	}

	protected void tearDown() throws Exception 
	{
		codeVisualizer = null;
	}

	public void testmethodWithPlainFlow()
	{
		String str = "Hello World";
		assertEquals(str, "Hello World");
	}
}
