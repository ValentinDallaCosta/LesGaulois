package personnages;

public class Druide {

	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();

	public Druide(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	public String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public void fabriquerPotion(int quantite, int forcePotion) {
		chaudron.remplirChaudron(quantite, forcePotion);
		System.out.println(
				"J'ai concocté " + quantite + " doses de potion magique. " + "Elle a une force de " + forcePotion + ".");
	}

	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			String nomGaulois = gaulois.getNom();

			if (nomGaulois == "Obelix") {
				parler("Non.. " + nomGaulois + " Non !... Et tu le sais très bien !");
			} else {
				int forcePotion = chaudron.prendreLouche();
				if (forcePotion == 0) {
					parler("Désolé " + nomGaulois + " il n'y a plus une seule goute de potion.");
				} else {
					gaulois.boirePotion(forcePotion);
					parler("Tiens " + nomGaulois + " un peu de potion magique !");
				}

			}
		}
	}

	public String getNom() {
		return nom;
	}

}
