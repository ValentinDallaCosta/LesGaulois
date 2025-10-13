package test_fonctionnel;

import objets.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);

		Gaulois obelix = new Gaulois("Obelix", 16);

		Romain brutus = new Romain("Brutus", 14);

		Druide panoramix = new Druide("Panoramix", 2);

		panoramix.fabriquerPotion(4, 3);
		panoramix.booster(obelix);
		panoramix.booster(asterix);

		for (int i = 0; i < 3; i++) {
			asterix.frapper(brutus);

		}
	}
}
