package com.junitexamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c=new Calculator();
		assertEquals(9,c.add(5,4));
	}

	@Test
	public void testSub() {
		Calculator c=new Calculator();
		assertEquals(1,c.sub(5, 4));
	}
	@Test
	public void testMul() {
		Calculator c=new Calculator();
		assertEquals(20,c.mul(5,4));
	}
	@Test
	public void testDiv() {
		Calculator c=new Calculator();
		assertEquals(0,c.div(5, 4));
	}
}