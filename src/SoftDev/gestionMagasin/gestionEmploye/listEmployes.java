package SoftDev.gestionMagasin.gestionEmploye;

public class listEmployes {

	private Employe employe;
	private listEmployes suivant;

	public listEmployes(Employe e, listEmployes le) {
		this.employe = e;
		this.suivant = le;
	}

	
	
	public Employe getEmploye() {
		return employe;
	}



	public void setEmploye(Employe employe) {
		this.employe = employe;
	}



	public listEmployes getListEmployes() {
		return suivant;
	}



	public void setListEmployes(listEmployes suivant) {
		this.suivant = suivant;
	}



	static listEmployes ajouterDebut(listEmployes le, listEmployes nv) throws Produitexception{
		if(le==null) {
			le=nv;
			return le;
		}
		listEmployes temp = le;
		int c = 0;
		while(temp!=null)
		{
			if(temp.employe.getIdentifiant()==nv.employe.getIdentifiant()) {
				System.out.println("produit existe deja");
				c=c+1;
			}
			temp=temp.suivant;
		}
		if(c!=0) {
			return le;
		}
			nv.suivant=le;
			le=nv;
			return le;
		
	
	}
	static void affichage(listEmployes le) {
		
		listEmployes temp = le;
		while(temp != null) {
		
			temp=temp.suivant;
		}
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
