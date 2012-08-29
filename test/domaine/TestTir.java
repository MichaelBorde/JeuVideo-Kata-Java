package domaine;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class TestTir {
	@Test
	public void uneCiblePeutEtreTouchee() {
		Cible cible = new Cible(0, 0);
		Tir tir = new Tir(0, 0);

		tir.vise(cible);

		assertThat(cible.isTouchee()).isTrue();
	}

	@Test
	public void ilEstPossibleDeRaterUneCible() {
		Cible cible = new Cible(3, 2);
		Tir tir = new Tir(1, 1);

		tir.vise(cible);

		assertThat(cible.isTouchee()).isFalse();
	}
}
