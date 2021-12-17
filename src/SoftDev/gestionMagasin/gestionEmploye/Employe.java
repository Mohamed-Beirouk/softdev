package SoftDev.gestionMagasin.gestionEmploye;


public abstract class Employe {

	private int identifiant;
	private String nom;
	private String adresse;
	private int nbr_heures;
	public static int compteur=0;

	public Employe(int identifiant, String nom, String adresse, int nbr_heures) {
		if(compteur <= 20) {
			this.identifiant = identifiant;
			this.nom = nom;
			this.adresse = adresse;
			this.nbr_heures = nbr_heures;
			compteur++;
		}
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNbr_heures() {
		return nbr_heures;
	}

	public void setNbr_heures(int nbr_heures) {
		this.nbr_heures = nbr_heures;
	}

	

	@Override
	public String toString() {
		return "Employe [identifiant=" + identifiant + ", nom=" + nom + ", adresse=" + adresse + ", nbr_heures="
				+ nbr_heures +  "]";
	}
	
	public abstract Double CalculeSalaire();

}

