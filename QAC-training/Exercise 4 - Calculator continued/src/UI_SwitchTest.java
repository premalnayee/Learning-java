import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UI_SwitchTest {

	
	@Test
	void testSwitch() {
		assertEquals(50, UI_Switch.Switch(25, 25, "+"));
		assertEquals(100, UI_Switch.Switch(49, 51, "+"));
		
		assertEquals(50, UI_Switch.Switch(100, 50, "-"));
		assertEquals(-5, UI_Switch.Switch(45, 50, "-"));
		
		assertEquals(25, UI_Switch.Switch(5, 5, "*"));
		assertEquals(60, UI_Switch.Switch(6, 10, "*"));
		
		assertEquals(2, UI_Switch.Switch(10, 5, "/"));
		assertEquals(5, UI_Switch.Switch(30, 6, "/"));	
	}
	


}
