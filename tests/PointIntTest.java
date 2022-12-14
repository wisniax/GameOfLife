import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointIntTest {
	
	@Test
	void testEquals_WhenEquals() {
		var pA = new PointInt(1, 1);
		var pB = new PointInt(1, 1);
		assertEquals(pA, pB);
	}
	
	@Test
	void testEquals_WhenNotEquals() {
		var pA = new PointInt(1, 1);
		var pB = new PointInt(2, 1);
		assertNotEquals(pA, pB);
	}
}