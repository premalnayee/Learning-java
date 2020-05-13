import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author premal
 *
 */
class CalculatorTest {

	/**
	 * Test method for {@link Calculator#add(int, int)}.
	 */

	Calculator calc = new Calculator();


	@Test
	public void testAdd() {
		assertEquals(10, calc.add(5,5));
		assertEquals(100, calc.add(50, 50));
	}


	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		assertEquals(5, calc.subtract(10, 5));
		assertEquals(15, calc.subtract(20, 5));
	}

	@Test
	public void testMultiply() {
		assertEquals(25, calc.multiply(5, 5));
		assertEquals(80, calc.multiply(40, 2));
	}

	@Test
	public void testDivide() {
		assertEquals(2, calc.divide(10, 5));
		assertEquals(0, calc.divide(10, 100));
	}

}
