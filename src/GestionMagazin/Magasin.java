package GestionMagazin;

public class Magasin{
	
	private int identifiant;
	private String adresse;
	private float capacite;
	private Listeproduit Listeproduit;
	
	public Magasin(int identifiant,String adresse,float capacite,Listeproduit listeproduit) throws Produitexception{
		
		controlerNombreProduit(listeproduit);
		
		this.identifiant=identifiant;
		this.adresse=adresse;
		this.capacite=capacite;
		this.Listeproduit=listeproduit;
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


	public Listeproduit getlisteproduits() {
		return Listeproduit;
	}

	public void setlisteproduits(Listeproduit Listeproduit) {
		this.Listeproduit = Listeproduit;
	}

	public static void controlerNombreProduit(Listeproduit Listeproduit) throws Produitexception{
		int nombreProduits=0;
		Listeproduit temp = Listeproduit;
			while(temp != null) {
				nombreProduits+=1;
				temp=temp.suivant;
			}
			if(nombreProduits>5) {
				throw new Produitexception("impossible, maximum nbre de produits est 5 !");
			}
		
	}
	void afficherMagsin() {
		
		System.out.println("\nl''identifiant est : "+this.identifiant);
		System.out.println("\nl''adresse est : "+this.adresse);
		System.out.println("\nla capacite est : "+this.capacite);
		System.out.println("\n---Liste des produits---");
		System.out.println("\nles produit sont : \n");
		Listeproduit.affichage(Listeproduit);
	}
	
	

			

}
