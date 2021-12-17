package SoftDev.gestionMagasin.gestionEmploye;

public class Listeresponsable {
	Responsable responsable;
	Listeresponsable suivant;

	public Listeresponsable(Responsable r, Listeresponsable suiv) {
		responsable=r;
		suivant=suiv;
	}

	static Listeresponsable ajouterDebut(Listeresponsable lc, Listeresponsable nv) throws Produitexception{
		if(lc==null) {
			lc=nv;
			return lc;
		}
		Listeresponsable temp = lc;
		int c = 0;
		while(temp!=null)
		{
			if(temp.responsable.getIdentifiant()==nv.responsable.getIdentifiant()) {
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
	static Listeresponsable ajouterDebut2(Listeresponsable lc, Listeresponsable nv) throws Produitexception{
		if(lc==null) {
			lc=nv;
			return lc;
		}
		Listeresponsable temp = lc;
		int c = 0;
		while(temp!=null)
		{
			if(temp.responsable.getIdentifiant()==nv.responsable.getIdentifiant()) {
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
	static void affichage(Listeresponsable lc) {
		
		Listeresponsable temp = lc;
		while(temp != null) {
			System.out.println("identifiant : " +temp.responsable.getIdentifiant()+ ", le nom : "+temp.responsable.getNom()+", le nombre heures : "
					+temp.responsable.getNbr_heures()+", le prime est : "+temp.responsable.getPrime());
			temp=temp.suivant;
		}
	}

}
