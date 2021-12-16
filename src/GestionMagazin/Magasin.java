package GestionMagazin;

public class Magasin{
	
	private int identifiant;
	private String adresse;
	private float capacite;
	private Listeproduit Listeproduit;
	
	public Magasin(int identifiant,String adresse,float capacite,Listeproduit listeproduit){
		
		
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
			if(nombreProduits>4) {
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
	public void comparerproduitesmagasin(Magasin m1, Magasin m2) {
		int nb=0;
		
		if(Listeproduit.NbrProd(m1.Listeproduit) == Listeproduit.NbrProd(m2.Listeproduit))
            { 
             
             System.out.println("Les nombre de produit de  ces deux magasin sont egaux");
             }
		if(Listeproduit.NbrProd(m1.Listeproduit) > Listeproduit.NbrProd(m2.Listeproduit))
         {
			nb=m1.identifiant; 
			System.out.println("Le magasin "+nb+" a plus de produit");
         }
		if(Listeproduit.NbrProd(m1.Listeproduit) < Listeproduit.NbrProd(m2.Listeproduit))
            {
			nb=m2.identifiant;
            System.out.println("Le magasin "+nb+" a plus de produit");
            }
	}

	public  Listeproduit supprimer(Magasin m, int x) {
		
		Listeproduit copie = m.Listeproduit;
		Listeproduit temp = copie;
		while(m.Listeproduit!=null) {
			if(m.Listeproduit.produit.getIdentifiant()==x) {
				Listeproduit=Listeproduit.suivant;
			}
			else {
				temp.produit=Listeproduit.produit;
				temp=temp.suivant;
				
				m.Listeproduit=m.Listeproduit.suivant;
			}
		}
		
		return copie;

	}
	
}
