package domaine;

import java.util.Observable;
import java.util.Observer;

public class Score implements Observer {
	public void cibleTouchee(Cible cible) {
		int impact = cible.isMalus() ? -100 : 100;
		valeur += impact;
	}

	@Override
	public void update(Observable o, Object arg) {
		cibleTouchee((Cible) o);
	}

	public int valeur;
}
