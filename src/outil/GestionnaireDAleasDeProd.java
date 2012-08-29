package outil;

import java.util.Random;

public class GestionnaireDAleasDeProd implements GestionnaireDAleas {
	@Override
	public boolean booleen() {
		return new Random().nextBoolean();
	}
}
