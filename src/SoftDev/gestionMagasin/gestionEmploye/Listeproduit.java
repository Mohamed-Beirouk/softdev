package SoftDev.gestionMagasin.gestionEmploye;

public class Listeproduit {
	
	Produit produit;
	Listeproduit suivant;

	public Listeproduit(Produit p, Listeproduit suiv) {
		produit=p;
		suivant=suiv;
	}

	static Listeproduit ajouterDebut(Listeproduit lp, Listeproduit nv) throws Produitexception{
		if(lp==null) {
			lp=nv;
			return lp;
		}
		Listeproduit temp = lp;
		int c = 0;
		while(temp!=null)
		{
			if(temp.produit.getIdentifiant()==nv.produit.getIdentifiant()) {
				System.out.println("produit existe deja");
				c=c+1;
			}
			temp=temp.suivant;
		}
		if(c!=0) {
			return lp;
		}
			nv.suivant=lp;
			lp=nv;
			return lp;
		
	
	}
	static void affichage(Listeproduit lp) {
		
		Listeproduit temp = lp;
		while(temp != null) {
			System.out.println("\n identifiant : " +temp.produit.getIdentifiant()+
					" libelle : " +temp.produit.getLibelle()+" marque : " +temp.produit.getMarque()+ 
					" prix : "+temp.produit.getPrix());
			
			temp=temp.suivant;
		}
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
	
	
	public int NbrProd(Listeproduit l){
		Listeproduit temp = l;
		int compteur=0;
		while(temp!=null) {
			compteur++;
			temp = temp.suivant;
		}
		return compteur;
	}
	static Listeproduit supprimerproduit(Produit p, Listeproduit lp) {
		if(lp.produit == p) {
			return lp.suivant;
		}
		return new Listeproduit(lp.produit, supprimerproduit(p, lp.suivant));
		
	
	
	}
}
