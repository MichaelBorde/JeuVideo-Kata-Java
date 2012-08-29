import java.util.Observable;

public class Cible extends Observable {

	public Cible(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public boolean isTouchee() {
		return touchee;
	}

	public void tuEsTouchée() {
		this.touchee = true;
		setChanged();
		notifyObservers();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isMalus() {
		return malus;
	}

	public void setMalus(boolean malus) {
		this.malus = malus;
	}

	private boolean touchee;
	private final int x;
	private final int y;
	private boolean malus;
}
