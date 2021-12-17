package SoftDev.gestionMagasin.gestionEmploye;

public class Responsable extends Employe{
	
	private Double prime;

	public Responsable(int identifiant, String nom, String adresse, int nbr_heures,  Double prime) {
		super(identifiant, nom, adresse, nbr_heures);
		this.prime = prime;
	}

	public Double getPrime() {
		return prime;
	}

	public void setPrime(Double prime) {
		this.prime = prime;
	}
	
	public Double CalculeSalaire() {
		if(this.getNbr_heures()>160) return this.getNbr_heures()*10 + prime + (this.getNbr_heures()*10)*0.2;
		return this.getNbr_heures()*10 + prime;
	}
	@Override
	public String toString() {
		return "Employe identifiant : " + this.getIdentifiant() + ", nom : " + this.getNom() + ", adresse :" + this.getAdresse() + ", nbr_heures : "
				+ this.getNbr_heures() + "le numero du caisse : "+this.prime;
	}

}

