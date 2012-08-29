import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class TestCible {
	@Test
	public void parDefautUneCibleNEstPasTouchée() {
		Cible cible = new Cible(0, 0);

		boolean touchee = cible.isTouchee();

		assertThat(touchee).isFalse();
	}
}
