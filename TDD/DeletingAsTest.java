  
package junittask;
import static org.junit.Assert.*;

import org.junit.Test;



public class DeletingAsTest {

	@Test
	public void test1() {
		assertEquals("BCD",DeletingAs.del("ABCD"));
	}
	@Test
	public void test2() {
		assertEquals("CD",DeletingAs.del("AACD"));
	}
	@Test
	public void test3() {
		assertEquals("BCD",DeletingAs.del("BACD"));
	}
	@Test
	public void test4() {
		assertEquals("BBAA",DeletingAs.del("BBAA"));
	}
	@Test
	public void test5() {
		assertEquals("BAA",DeletingAs.del("AABAA"));
	}
	@Test
	public void test6() {
		assertEquals("",DeletingAs.del(""));
	}
	@Test
	public void test7() {
		assertEquals("",DeletingAs.del("A"));
	}

}