package GestionMagazin;

public class listStore {
	Magasin magasin;
	listStore suivant;

	public listStore(Magasin m, listStore ls) {
		magasin = m;
		suivant = ls;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}

	public listStore getSuivant() {
		return suivant;
	}

	public void setSuivant(listStore suivant) {
		this.suivant = suivant;
	}

	static listStore ajouterDebut(listStore ls, listStore nv){
		if(ls==null) {
			ls=nv;
			return ls;
		}
		nv.suivant=ls;
		ls=nv;
		return ls;
		
	}
	
	static void affichage(listStore ls) {
		System.out.println("--------affichage des magasin du liststore-----------------\n \n");
		listStore temp = ls;
		while(temp != null) {
				temp.magasin.afficherMagsin();
			temp=temp.suivant;
			}
		
		}
	public int NbrProdtotal(listStore ls){
		listStore temp = ls;
		int compteur=0;
		while(temp!=null) {
			while(temp.magasin.getlisteproduits()!=null) {
					Listeproduit tempm = temp.magasin.getlisteproduits();
					int compteurp=0;
										while(tempm!=null) {
											compteurp++;
											tempm = tempm.suivant;
												}
			
					compteur=compteur+compteurp;
					}
			
			temp = temp.suivant;
			}
		return compteur;
	}
	
//	static boolean chercher(listStore lm, Produit p) {
//		
//		listStore temp = lm;
//		while(temp != null) {
//			while(temp.magasin.getlisteproduits() !=null) {
//				if(temp.magasin.getlisteproduits().produit.getIdentifiant()==p.getIdentifiant()) {
//					return true;
//				}
//				@SuppressWarnings("unused")
//				Listeproduit lp =temp.magasin.getlisteproduits();
//				lp = temp.magasin.getlisteproduits().suivant;
//				
//			}
//			
//		temp=temp.suivant;
//		}
//		return false;
//	}

}
