package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[2];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
	}
	
	private boolean isInvariantVerified() {
		return force >= 0;
	}
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		default:
			if (nbEquipement == 1 && equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipements[0] +" !");
			}
			else {
				System.out.println("Le soldat " + nom + " s’équipe avec un " + equipement +" !");
				equipements[nbEquipement] = equipement;
				nbEquipement++;
			}
			break;
		}
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert isInvariantVerified();
		force = force - forceCoup;
		if (force < 1) {
			parler("J'abandone !");
		} else {
			parler("Aie");
		}
		
		assert isInvariantVerified();
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		System.out.println(Equipement.CASQUE);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
