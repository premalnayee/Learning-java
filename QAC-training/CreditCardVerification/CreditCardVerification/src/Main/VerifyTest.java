package Main;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerifyTest {
	
	Verify card = new Verify();

	@Test
	void testValidCard() {
		
	}

	@Test
	void testValidCardCheckFirst() {
		assertTrue(card.validCardCheckFirst("456"));
		assertTrue(card.validCardCheckFirst("5452"));
		assertTrue(card.validCardCheckFirst("6542"));
		assertTrue(card.validCardCheckFirst("5445665105"));
		assertFalse(card.validCardCheckFirst("12354"));
		assertFalse(card.validCardCheckFirst("2546216"));
		assertFalse(card.validCardCheckFirst("8561321"));
	}

	@Test
	void testCheckLength() {
		assertTrue(card.checkLength("1234567890123456"));
		assertTrue(card.checkLength("6543218543216843"));
		assertTrue(card.checkLength("5465486548432188"));
		assertTrue(card.checkLength("8465-4568-4584-4564"));
		assertTrue(card.checkLength("8465-5465-8465-2166"));
		assertFalse(card.checkLength("8465-5465545-5646"));
		assertFalse(card.checkLength("984654894654958"));
		assertFalse(card.checkLength("21654984654684"));
		assertFalse(card.checkLength("5565165165168-*8"));
	}
	
	

	@Test
	void testValidCharacters() {
		assertTrue(card.checkLength("1111-2222-3333-4444"));
	}

	@Test
	void testCheckNotRepeated() {
		fail("Not yet implemented");
	}

}
