package SoftDev.gestionMagasin.gestionEmploye;

public class Listevendeurs {
	
	Vendeur vendeur;
	Listevendeurs suivant;

	public Listevendeurs(Vendeur v, Listevendeurs suiv) {
		vendeur=v;
		suivant=suiv;
	}

	static Listevendeurs ajouterDebut(Listevendeurs lv, Listevendeurs nv) throws Produitexception{
		if(lv==null) {
			lv=nv;
			return lv;
		}
		Listevendeurs temp = lv;
		int c = 0;
		while(temp!=null)
		{
			if(temp.vendeur.getIdentifiant()==nv.vendeur.getIdentifiant()) {
				System.out.println("vendeur existe deja");
				c=c+1;
			}
			temp=temp.suivant;
		}
		if(c!=0) {
			return lv;
		}
			nv.suivant=lv;
			lv=nv;
			return lv;
		
	
	}static Listevendeurs ajouterDebut2(Listevendeurs lv, Listevendeurs nv) throws Produitexception{
		if(lv==null) {
			lv=nv;
			return lv;
		}
		Listevendeurs temp = lv;
		int c = 0;
		while(temp!=null)
		{
			if(temp.vendeur.getIdentifiant()==nv.vendeur.getIdentifiant()) {
				System.out.println("vendeur existe deja");
				c=c+1;
			}
			temp=temp.suivant;
		}
		if(c!=0) {
			return lv;
		}
			nv.suivant=lv;
			lv=nv;
			return lv;
		
	
	}
	static void affichage(Listevendeurs lv) {
		
		Listevendeurs temp = lv;
		while(temp != null) {
			System.out.println("\n identifiant : " +temp.vendeur.getIdentifiant()+ ", le nom : "+temp.vendeur.getNom()+", le nombre heures : "
					+temp.vendeur.getNbr_heures()+", taux de vente : "+temp.vendeur.getTauxDeVente());
			
			temp=temp.suivant;
		}
	}

}

