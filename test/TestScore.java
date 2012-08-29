import static org.fest.assertions.Assertions.*;

import org.junit.Before;
import org.junit.Test;

public class TestScore {

	@Before
	public void préparation() {
		cible = new Cible(0, 0);
		score = new Score();
		score.valeur = 500;
		cible.addObserver(score);
	}

	@Test
	public void toucherUneCibleBonusDonneDesPoints() {
		cible.tuEsTouchée();

		assertThat(score.valeur).isEqualTo(600);
	}

	@Test
	public void toucherUneCibleMalusFaitPerdreDesPoints() {
		cible.setMalus(true);

		cible.tuEsTouchée();

		assertThat(score.valeur).isEqualTo(400);
	}

	private Cible cible;
	private Score score;
}
