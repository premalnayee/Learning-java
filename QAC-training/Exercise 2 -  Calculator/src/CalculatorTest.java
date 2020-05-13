import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
	
	@BeforeClass
	public static void beforeEverything() {
		System.out.println("potatoes");
	}

	@Test
	public void testAdd() {
		assertEquals(10, Calculator.add(5,5));
		assertEquals(100, Calculator.add(50, 50));
	}


	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		assertEquals(5, Calculator.subtract(10, 5));
		assertEquals(15, Calculator.subtract(20, 5));
	}

	@Test
	public void testMultiply() {
		assertEquals(25, Calculator.multiply(5, 5));
		assertEquals(80, Calculator.multiply(40, 2));
	}

	@Test
	public void testDivide() {
		assertEquals(2, Calculator.divide(10, 5));
		assertEquals(0, Calculator.divide(10, 100));
	}

}
