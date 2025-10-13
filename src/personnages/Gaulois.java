package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void setVillage(Village village) {
		this.village = village;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
	}

	@Override
	public String toString() {
		return nom;
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire " + "de " + romain.getNom());
		romain.recevoirCoup((force * effetPotion) / 3);

		effetPotion = effetPotion > 1 ? effetPotion-1 : 1;
	}
	
	public void sePresenter() {
		if (village != null && village.getChef() == this) {
			parler("Bonjour, je m'appelle "
					+ nom + ". Je suis le chef du village " + village.getNom() + ".");
		}
		else if (village != null && village.getChef() != this) {
			parler("Bonjour, je m'appelle "
					+ nom + ". J'habite le village " + village.getNom() + ".");
		}
		else {
			parler("Bonjour, je m'appelle "
					+ nom + ". Je voyage de village en village.");
		}
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);

		System.out.println(asterix);
	}
}
