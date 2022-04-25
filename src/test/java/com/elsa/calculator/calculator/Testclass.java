package com.elsa.calculator.calculator;

import org.junit.Assert;

public class Testclass {

	@org.junit.Test
	public void testaddition() {
	CheckForFunction checkForFunction = new CheckForFunction();
	
	Assert.assertTrue(2.0 == checkForFunction.arithmeticfunctions("1+1").doubleValue());
	Assert.assertTrue(13.5 == checkForFunction.arithmeticfunctions("6+3+4.5").doubleValue());
	
	}
	
	@org.junit.Test
	public void testsubtraction() {
		CheckForFunction checkForFunction = new CheckForFunction();
		
		Assert.assertTrue(5.0 == checkForFunction.arithmeticfunctions("15.5-10.5").doubleValue());
		Assert.assertTrue(1.2000000000000006 == checkForFunction.arithmeticfunctions("9.8-5.2-3.4").doubleValue());
		
	}
	
	@org.junit.Test
	public void testmultiplication() {
		CheckForFunction checkForFunction = new CheckForFunction();
		
		Assert.assertTrue(27.0 == checkForFunction.arithmeticfunctions("9.0*3.0").doubleValue());
		Assert.assertTrue(22.099999999999998 == checkForFunction.arithmeticfunctions("2.5*2.6*3.4").doubleValue());
	}
	
	@org.junit.Test
	public void testdivision() {
		CheckForFunction checkForFunction = new CheckForFunction();
		
		Assert.assertTrue(9.0 == checkForFunction.arithmeticfunctions("27/3").doubleValue());
		Assert.assertTrue(3.8095238095238093 == checkForFunction.arithmeticfunctions("64/8/2.1").doubleValue());
		Assert.assertTrue(null == checkForFunction.arithmeticfunctions("9/0"));
		
	}
	
}
