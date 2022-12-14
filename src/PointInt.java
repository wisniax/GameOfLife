public class PointInt {
	int x;
	int y;
	
	public PointInt(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof PointInt)) {
			return false;
		}
		return x == ((PointInt) o).getX() && y == ((PointInt) o).getY();
	}
}
