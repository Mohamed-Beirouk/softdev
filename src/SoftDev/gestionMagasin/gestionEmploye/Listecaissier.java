package SoftDev.gestionMagasin.gestionEmploye;

public class Listecaissier {


	Caissier caissier;
	Listecaissier suivant;

	public Listecaissier(Caissier c, Listecaissier suiv) {
		caissier=c;
		suivant=suiv;
	}

	static Listecaissier ajouterDebut(Listecaissier lc, Listecaissier nv) throws Produitexception{
		if(lc==null) {
			lc=nv;
			return lc;
		}
		Listecaissier temp = lc;
		int c = 0;
		while(temp!=null)
		{
			if(temp.caissier.getIdentifiant()==nv.caissier.getIdentifiant()) {
				System.out.println("caissier existe deja");
				c=c+1;
			}
			temp=temp.suivant;
		}
		if(c!=0) {
			return lc;
		}
			nv.suivant=lc;
			lc=nv;
			return lc;
		
	
	}
	static Listecaissier ajouterDebut2(Listecaissier lc, Listecaissier nv) throws Produitexception{
		if(lc==null) {
			lc=nv;
			return lc;
		}
		Listecaissier temp = lc;
		int c = 0;
		while(temp!=null)
		{
			if(temp.caissier.getIdentifiant()==nv.caissier.getIdentifiant()) {
				System.out.println("caissier existe deja");
				c=c+1;
			}
			temp=temp.suivant;
		}
		if(c!=0) {
			return lc;
		}
			nv.suivant=lc;
			lc=nv;
			return lc;
		
	
	}
	static void affichage(Listecaissier lc) {
		
		Listecaissier temp = lc;
		while(temp != null) {
			System.out.println("\n identifiant : " +temp.caissier.getIdentifiant()+ ". le nom : "+temp.caissier.getNom()+", le nombre heures "
					+temp.caissier.getNbr_heures()+", numero de caisse : "+temp.caissier.getNumeroDeCaisse());
			
			temp=temp.suivant;
		}
	}

}
