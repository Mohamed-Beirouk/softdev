package SoftDev.gestionMagasin.gestionEmploye;

public class Vendeur extends Employe{

	private Double tauxDeVente;
	
	public Vendeur(int identifiant, String nom, String adresse, int nbr_heures,  Double tauxDeVente) {
		super(identifiant, nom, adresse, nbr_heures);
		this.tauxDeVente = tauxDeVente;
	}

	public Double getTauxDeVente() {
		return tauxDeVente;
	}

	public void setTauxDeVente(Double tauxDeVente) {
		this.tauxDeVente = tauxDeVente;
	}
	
	public Double CalculeSalaire() {
		return tauxDeVente*450;
	}
	@Override
	public String toString() {
		return "Employe identifiant : " + this.getIdentifiant() + ", nom : " + this.getNom() + ", adresse :" + this.getAdresse() + ", nbr_heures : "
				+ this.getNbr_heures() + "le numero du caisse : "+this.tauxDeVente;
	}

}
