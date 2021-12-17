package SoftDev.gestionMagasin.gestionEmploye;

public class Caissier extends Employe{

	private int numeroDeCaisse;
	
	public Caissier(int identifiant, String nom, String adresse, int nbr_heures,  int numeroDeCaisse) {
		super(identifiant, nom, adresse, nbr_heures);
		this.numeroDeCaisse = numeroDeCaisse;
	}

	public int getNumeroDeCaisse() {
		return numeroDeCaisse;
	}

	public void setNumeroDeCaisse(int numeroDeCaisse) {
		this.numeroDeCaisse = numeroDeCaisse;
	}
	@Override
	public String toString() {
		return " identifiant : " + this.getIdentifiant() + ", nom : " + this.getNom() + ", adresse :" + this.getAdresse() + ", nbr_heures : "
				+ this.getNbr_heures() + "le numero du caisse : "+this.numeroDeCaisse;
	}
	
	public Double CalculeSalaire() {
		if(this.getNbr_heures()>180) return this.getNbr_heures()*10 + (this.getNbr_heures()*10)*0.15;
		return this.getNbr_heures()*5.0;
	}
	
}