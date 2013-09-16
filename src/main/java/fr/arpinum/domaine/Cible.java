package fr.arpinum.domaine;

import java.util.Observable;

import fr.arpinum.outil.GestionnaireDAleas;
import fr.arpinum.outil.GestionnaireDAleasDeProd;

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

	public boolean isBonus() {
		return !isMalus();
	}

	public boolean isMalus() {
		return malus;
	}

	public void définisEtat() {
		malus = !gestionnaire.booleen();
	}

	public void setGestionnaire(GestionnaireDAleas gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	private boolean touchee;
	private final int x;
	private final int y;
	private boolean malus;
	private GestionnaireDAleas gestionnaire = new GestionnaireDAleasDeProd();
}
