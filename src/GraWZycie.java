import java.awt.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class GraWZycie {
	Map<PointInt, Integer> aliveCells;
	private Strategia strategia;

	public GraWZycie(Strategia strategia) {
		aliveCells = new HashMap<>();
		this.strategia = strategia;
	}

	public static void main(String[] args) {
		GraWZycie graWZycie = new GraWZycie(new StrategiaConway());
		graWZycie.aliveCells.put(new PointInt(152, 2), 0);
		graWZycie.aliveCells.put(new PointInt(5, 2), 0);
		graWZycie.aliveCells.put(new PointInt(7, 2), 0);
		var test = graWZycie.dajMinX();
	}

	//GraWZycie - klasa, metody: ozyw(), zabij(), ustawStrategie(), dajMinX()..., krok(), dajPlansze(), dajPlanszeStr(), ileZywych()
	public void ozyw(int x, int y) {

	}

	public void zabij(int x, int y) {
	}

	public void ustawStrategie(Strategia str) {
		strategia = str;
	}

	public int dajMinX() {
		return Collections.min(aliveCells.keySet(), (entry1, entry2) -> Integer.compare(entry1.getX(), entry2.getY())).getX();
	}

	public int dajMaxX() {
		return 0;
	}

	public int dajMinY() {
		return 0;
	}

	public int dajMaxY() {
		return 0;
	}
}
