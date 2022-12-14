import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraWZycieTest {
	GraWZycie setUp() {
		GraWZycie graWZycie = new GraWZycie(new StrategiaConway());
		graWZycie.aliveCells.put(new PointInt(152, 2), 1);
		graWZycie.aliveCells.put(new PointInt(5, 3), 2);
		graWZycie.aliveCells.put(new PointInt(7, 1), 3);
		graWZycie.aliveCells.put(new PointInt(15, 32), 15);
		graWZycie.aliveCells.put(new PointInt(66, 5), 5);
		graWZycie.aliveCells.put(new PointInt(7, 15), 22);
		return graWZycie;
	}
	
	@Test
	void dajMinX() {
		assertEquals(5, setUp().dajMinX());
	}
	
	@Test
	void dajMaxX() {
		assertEquals(152, setUp().dajMaxX());
	}
	
	@Test
	void dajMinY() {
		assertEquals(1, setUp().dajMinY());
	}
	
	@Test
	void dajMaxY() {
		assertEquals(32, setUp().dajMaxY());
	}
	
	@Test
	void ozyw() {
		var gra = setUp();
		gra.ozyw(7, 7);
		assertTrue(gra.aliveCells.containsValue(0));
	}
	
	@Test
	void zabij() {
		var gra = setUp();
		assertTrue(gra.aliveCells.containsValue(2));
		gra.zabij(5, 3);
		assertFalse(gra.aliveCells.containsValue(2));
	}
}