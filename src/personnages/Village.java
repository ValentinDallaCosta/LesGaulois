package personnages;

public class Village {
	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Gaulois chef;

	public Village(String nom, Gaulois chef, int nb_max) {
		this.nom = nom;
		this.chef = chef;
		villageois = new Gaulois[nb_max];
	}

	public Gaulois getChef() {
		return chef;
	}

	public String getNom() {
		return nom;
	}

	public Gaulois trouverVillageois(int numVillageois) {
		if (numVillageois <= nbVillageois && numVillageois > 0) {
			return villageois[numVillageois - 1];
		}
		System.out.println("Il n'y a pas autant d'habitants dans notre village !");
		return null;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}

	public void afficherVillageois() {
		System.out.println("Dans le village \"" + nom +"\" du "
				+ "chef " + chef +" vivent les legendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("- " + villageois[i]);
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);

		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterVillageois(asterix);

		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterVillageois(obelix);
		village.afficherVillageois();
		
		Gaulois doublePolemix = new Gaulois("DoublePolémix ", 4);
		abraracourcix.sePresenter();
		asterix.sePresenter();
		doublePolemix.sePresenter();
		
		
	}
}
