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

	//GraWZycie - klasa, metody: ozyw(), zabij(), ustawStrategie(), dajMinX()..., krok(), dajPlansze(), dajPlanszeStr(), ileZywych()
	public void ozyw(int x, int y) {
		var cell = getPointFromMap(x, y);
		if (cell == null) aliveCells.put(new PointInt(x, y), 0);
		else if (aliveCells.get(cell) <= 0) aliveCells.put(cell, 0);
	}

	public void zabij(int x, int y) {
		var cell = getPointFromMap(x, y);
		if (cell != null) aliveCells.remove(cell);
	}

	public int[][] dajPlansze(int minX, int minY, int maxX, int maxY) {
		int[][] arena = new int[maxY - minY + 1][maxX - minX + 1];
		for (int y = minY; y <= maxY; y++) {
			for (int x = minX; x <= maxX; x++) {
				PointInt pointFromMap = getPointFromMap(x, y);
				arena[y - minY][x - minX] = (pointFromMap == null) ? -1 : aliveCells.get(pointFromMap);
			}
		}
		return arena;
	}

	PointInt getPointFromMap(int x, int y) {
		var point = new PointInt(x, y);
		for (var cell :
				aliveCells.keySet()) {
			if (cell.equals(point)) return cell;
		}
		return null;
	}

	public boolean krok() {
		return true;
	}

	public void ustawStrategie(Strategia str) {
		strategia = str;
	}

	public int dajMinX() {
		return Collections.min(aliveCells.keySet(), (entry1, entry2) -> Integer.compare(entry1.getX(), entry2.getX())).getX();
	}

	public int dajMaxX() {
		return Collections.max(aliveCells.keySet(), (entry1, entry2) -> Integer.compare(entry1.getX(), entry2.getX())).getX();
	}

	public int dajMinY() {
		return Collections.min(aliveCells.keySet(), (entry1, entry2) -> Integer.compare(entry1.getY(), entry2.getY())).getY();
	}

	public int dajMaxY() {
		return Collections.max(aliveCells.keySet(), (entry1, entry2) -> Integer.compare(entry1.getY(), entry2.getY())).getY();
	}
}
