package devops.sl;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {
	MyCalc calc = new MyCalc();
	


	@Test
	public void test() {
		
		assertEquals(40, calc.sum(30, 10));
		
	}
}