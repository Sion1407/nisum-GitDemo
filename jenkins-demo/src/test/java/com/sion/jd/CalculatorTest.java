package com.sion.jd;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	Calculator c;
	@Before
	public void setup() throws Exception{
		c = new Calculator();
	}
	@After
	public void tearDown() throws Exception{
		c = null;
	}
	@Test
	public void testSum() {
		assertEquals(100,c.sum(10,20,30,40));
	}
	@Test
	public void testSquare() {
		assertEquals(215,c.square(15));
	}
	@Test
	public void testPower() {
		assertEquals(125,c.power(5, 3));
	}
}
