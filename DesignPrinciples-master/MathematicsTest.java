package junitprograms;

import static org.junit.Assert.*;

import org.junit.Test;

public class MathematicsTest {

	@Test
	public void testIsEven() {
		Mathematics m = new Mathematics();
		assertEquals(true,m.isEven(8));
		assertTrue(m.isEven(10));
		assertFalse(m.isEven(99));
		assertFalse(m.isEven(111111));
	}

	@Test
	public void testSortArray() {
		int [] n1= {-1,2,141,78,987,34};
		int [] n2= {1,2,34,56,78,141};
		Mathematics m = new Mathematics();
		assertArrayEquals(n2,m.sortArray(n1));
		//assertEquals(n2,m.sortArray(n1));
	}

	@Test
	public void testIsNull() {
		Mathematics m = new Mathematics();
	//	assertEquals(null,m.isNull(null));
		assertTrue(m.isNull(null));
		assertFalse(m.isNull("test"));
		
	}

}