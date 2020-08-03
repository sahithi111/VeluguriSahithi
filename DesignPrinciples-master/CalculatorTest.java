package junitprograms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
	Calculator c = new Calculator();   //assert methods 
	assertEquals(121,c.add(100, 21));
	assertEquals(85,c.add(45, 40));
	}

	@Test
	public void testMul() {
		//fail("Not yet implemented");
	
		Calculator c = new Calculator();
		assertEquals(4,c.mul(2, 2));
		assertEquals(35,c.mul(7, 5));
	}
	@Test
	public void testSub() {
		//fail("Not yet implemented");
		Calculator c = new Calculator();
		assertEquals(4,c.sub(6, 2));
		assertEquals(3,c.sub(7, 4));
	}
}