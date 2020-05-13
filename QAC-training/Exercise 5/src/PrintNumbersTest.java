import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrintNumbersTest extends PrintNumbers {

	@Test
	void testPrintArrangeStr() {
		assertEquals("one, two, three, four, five, six, seven, eight, nine, ten", PrintNumbers.PrintArrangeStr(1, 10));
	}

	@Test
	void testPrintWordArrange() {
		assertEquals(" eight", PrintNumbers.PrintWordArrange(8));
		assertEquals(" sixteen", PrintNumbers.PrintWordArrange(16));
		assertEquals(" twenty", PrintNumbers.PrintWordArrange(20));
		assertEquals(" thirty three", PrintNumbers.PrintWordArrange(33));
		assertEquals(" fifty four", PrintNumbers.PrintWordArrange(54));
		assertEquals(" sixty seven", PrintNumbers.PrintWordArrange(67));
		assertEquals(" ninety two", PrintNumbers.PrintWordArrange(92));
		assertEquals(" one hundread", PrintNumbers.PrintWordArrange(100));
		assertEquals(" two hundread", PrintNumbers.PrintWordArrange(200));
		assertEquals(" three hundread", PrintNumbers.PrintWordArrange(300));
		assertEquals(" three hundread and twenty two", PrintNumbers.PrintWordArrange(322));
	}
	
	

}
