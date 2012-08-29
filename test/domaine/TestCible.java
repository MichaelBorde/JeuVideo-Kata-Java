package domaine;

import static org.fest.assertions.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import doublure.GestionnaireDAleasDeTest;

public class TestCible {

	@Before
	public void preparation() {
		cible = new Cible(0, 0);
	}

	@Test
	public void parDefautUneCibleNEstPasTouchee() {
		boolean touchee = cible.isTouchee();

		assertThat(touchee).isFalse();
	}

	@Test
	public void parDefautUneCibleEstCapableDeDefinirSonEtat() {
		cible.définisEtat();

		assureToiQueTouTSEstBienPasse();
	}

	private void assureToiQueTouTSEstBienPasse() {
	}

	@Test
	public void uneCiblePeutAleatoirementEtreMalus() {
		GestionnaireDAleasDeTest gestionnaire = creeGestionnaireRetournant(false);
		cible.setGestionnaire(gestionnaire);

		cible.définisEtat();

		assertThat(cible.isMalus()).isTrue();
	}

	@Test
	public void uneCiblePeutAleatoirementEtreBonus() {
		GestionnaireDAleasDeTest gestionnaire = creeGestionnaireRetournant(true);
		cible.setGestionnaire(gestionnaire);

		cible.définisEtat();

		assertThat(cible.isBonus()).isTrue();
	}

	private GestionnaireDAleasDeTest creeGestionnaireRetournant(boolean valeur) {
		GestionnaireDAleasDeTest gestionnaire = new GestionnaireDAleasDeTest();
		gestionnaire.setBooleenARetourner(valeur);
		return gestionnaire;
	}

	private Cible cible;
}
