package fr.arpinum.domaine;

import static org.fest.assertions.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import fr.arpinum.doublure.GestionnaireDAleasDeTest;
import fr.arpinum.domaine.Cible;
import fr.arpinum.domaine.Score;

public class TestScore {

	@Before
	public void preparation() {
		cible = new Cible(0, 0);
		score = new Score();
		score.valeur = 500;
		cible.addObserver(score);
	}

	@Test
	public void toucherUneCibleBonusDonneDesPoints() {
		metsLaCibleDansLEtat(true);

		cible.tuEsTouchée();

		assertThat(score.valeur).isEqualTo(600);
	}

	@Test
	public void toucherUneCibleMalusFaitPerdreDesPoints() {
		metsLaCibleDansLEtat(false);

		cible.tuEsTouchée();

		assertThat(score.valeur).isEqualTo(400);
	}

	private void metsLaCibleDansLEtat(boolean bonus) {
		GestionnaireDAleasDeTest gestionnaire = new GestionnaireDAleasDeTest();
		gestionnaire.setBooleenARetourner(bonus);
		cible.setGestionnaire(gestionnaire);
		cible.définisEtat();
	}

	private Cible cible;
	private Score score;
}
