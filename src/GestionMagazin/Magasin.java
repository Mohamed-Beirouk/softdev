package GestionMagazin;

public class Magasin {
	
	private int identifiant;
	private String adresse;
	private float capacite;
	private Produit listeproduits;
	
	public Magasin() {
		
	}

	public int getIdentifiant() {
		return identifiant;
	}


	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public float getCapacite() {
		return capacite;
	}


	public void setCapacite(float capacite) {
		this.capacite = capacite;
	}


	public Produit getlisteproduits() {
		return listeproduits;
	}

	public void setlisteproduits(Produit listeproduits) {
		this.listeproduits = listeproduits;
	}


	
	

	

}
