import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategiaTest {

	@Test
	void czyOzywic_With_2_True() {
		Strategia strat = new StrategiaConway();
		boolean[][] table = new boolean[3][3];
		table[0][1] = true;
		table[0][2] = true;
		assertFalse(strat.czyOzywic(table));
	}

	@Test
	void czyOzywic_With_3_True() {
		Strategia strat = new StrategiaConway();
		boolean[][] table = new boolean[3][3];
		table[0][1] = true;
		table[0][2] = true;
		table[2][2] = true;
		assertTrue(strat.czyOzywic(table));
	}

	@Test
	void czyZabic() {
	}
}