package SoftDev.gestionMagasin.gestionEmploye;


public class Magasin{
	
	private int identifiant;
	private String adresse;
	private float capacite;
	private Listeproduit Listeproduit;
	private Listecaissier listecaissier;
	private Listevendeurs listevendeurs;
	private Listeresponsable listeresponsable;
	
	public Magasin(int identifiant,String adresse,float capacite,Listeproduit listeproduit,Listecaissier listecaissier,Listevendeurs listevendeurs,Listeresponsable listeresponsable){
		
		
		this.identifiant=identifiant;
		this.adresse=adresse;
		this.capacite=capacite;
		this.Listeproduit=listeproduit;
		this.listecaissier=listecaissier;
		this.listevendeurs=listevendeurs;
		this.listeresponsable=listeresponsable;
		
	}
//	public Magasin(int identifiant,String adresse,float capacite,Listeproduit listeproduit,Listevendeurs listevendeurs){
//		
//		
//		this.identifiant=identifiant;
//		this.adresse=adresse;
//		this.capacite=capacite;
//		this.Listeproduit=listeproduit;
//		this.listevendeurs=listevendeurs;
//	}
//	public Magasin(int identifiant,String adresse,float capacite,Listeproduit listeproduit,Listeresponsable listeresponsable){
//		
//	this.identifiant=identifiant;
//	this.adresse=adresse;
//	this.capacite=capacite;
//	this.Listeproduit=listeproduit;
//	this.listeresponsable=listeresponsable;
//	}
	
	

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
	

	public Listeproduit getListeproduit() {
		return Listeproduit;
	}

	public void setListeproduit(Listeproduit listeproduit) {
		Listeproduit = listeproduit;
	}

	
	public Listecaissier getListecaissier() {
		return listecaissier;
	}
	public void setListecaissier(Listecaissier listecaissier) {
		this.listecaissier = listecaissier;
	}
	public Listevendeurs getListevendeurs() {
		return listevendeurs;
	}
	public void setListevendeurs(Listevendeurs listevendeurs) {
		this.listevendeurs = listevendeurs;
	}
	public Listeresponsable getListeresponsable() {
		return listeresponsable;
	}
	public void setListeresponsable(Listeresponsable listeresponsable) {
		this.listeresponsable = listeresponsable;
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
		
		System.out.println("\nles caissier  sont : \n");
		Listecaissier.affichage(listecaissier);
		
		System.out.println("\nles vendeurs du  sont : \n");
		Listevendeurs.affichage(listevendeurs);
		
		System.out.println("\nles responsables sont : \n");
		Listeresponsable.affichage(listeresponsable);
		
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
