package outil;

import static org.fest.assertions.Assertions.*;

import org.junit.Test;

public class TestGestionnaireDAleasDeProd {
	@Test
	public void peutRenvoyerParfoisVrai() {
		GestionnaireDAleasDeProd gestionnaire = new GestionnaireDAleasDeProd();

		boolean resultat = aRenvoyeAuMoinsUneFoisLaValeurAttendue(gestionnaire, true);

		assertThat(resultat).isTrue();
	}

	@Test
	public void peutRenvoyerParfoisFaux() {
		GestionnaireDAleasDeProd gestionnaire = new GestionnaireDAleasDeProd();

		boolean resultat = aRenvoyeAuMoinsUneFoisLaValeurAttendue(gestionnaire, false);

		assertThat(resultat).isTrue();
	}

	private boolean aRenvoyeAuMoinsUneFoisLaValeurAttendue(GestionnaireDAleas gestionnaire, boolean attendu) {
		for (int i = 0; i < 100; i++) {
			if (gestionnaire.booleen() == attendu) {
				return true;
			}
		}
		return false;
	}
}
