package GestionMagazin;

public class Listeproduit {
	
	Produit produit;
	Listeproduit suivant;

	public Listeproduit(Produit p, Listeproduit suiv) {
		produit=p;
		suivant=suiv;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Listeproduit getSuivant() {
		return suivant;
	}

	public void setSuivant(Listeproduit suivant) {
		this.suivant = suivant;
	}
	
	static Listeproduit ajouterDebut(Listeproduit lp, Listeproduit nv) {
		nv.suivant=lp;
		lp=nv;
		return lp;
	}
	static void affichage(Listeproduit lp) {
		Listeproduit temp = lp;
		while(temp != null) {
			System.out.println(" \n"+temp.produit);
			temp=temp.suivant;
		}
	}
	

}
