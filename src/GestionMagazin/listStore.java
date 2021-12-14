package GestionMagazin;

public class listStore {
	Magasin magasin;
	listStore suivant;

	public listStore(Magasin m, listStore ls) {
		magasin = m;
		suivant = ls;
	}

}
