package fr.arpinum.doublure;

import fr.arpinum.outil.GestionnaireDAleas;

public class GestionnaireDAleasDeTest implements GestionnaireDAleas {
	public void setBooleenARetourner(boolean valeur) {
		this.booleenARetourner = valeur;
	}

	@Override
	public boolean booleen() {
		return booleenARetourner;
	}

	private boolean booleenARetourner;
}
