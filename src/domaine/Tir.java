package domaine;

public class Tir {
	public Tir(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void vise(Cible cible) {
		if (x == cible.getX() && y == cible.getY()) {
			cible.tuEsTouchée();
		}
	}

	private int x;
	private int y;
}
