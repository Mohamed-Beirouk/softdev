package SoftDev.gestionMagasin.gestionEmploye;
import java.util.Scanner;

public class Produit {
	
	private int identifiant;
	private String libelle;
	private String marque;
	private float prix;

	public Produit(int identifiant, String libelle, String marque, float prix) throws prixProduitException {
		controlerPrix(prix);
		this.identifiant=identifiant;
		this.libelle=libelle;
		this.marque=marque;
		this.prix=prix;
	}
	public Produit() throws prixProduitException{
		controlerPrix(prix);
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}

	public void SaisirProduit() throws prixProduitException{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("donner identifiant du produit :");
		this.identifiant=sc.nextInt();
		@SuppressWarnings("unused")String pos= sc.nextLine();
		System.out.println("donner la marque du produit :");
		this.marque=sc.nextLine();
		System.out.println("donner le libelle du produit:");
		this.libelle=sc.nextLine();
		System.out.println("donner le prix :");
		this.prix=sc.nextFloat();
		controlerPrix(prix);
		
//		sc.close();
		
	}
	
	public void AfficherProduit() {
		
		System.out.println("identifiant :"+this.identifiant);
		System.out.println("libelle :"+this.libelle);
		System.out.println("marque :"+this.marque);		
		System.out.println("prix :"+this.prix);
	}
	public void controlerPrix(float prix) throws prixProduitException{
		
		if(prix<0) {
			throw new prixProduitException("impossible, le produit ne peut pas etre negative !");
		}
		
	}
	public boolean comparer(Produit p1,Produit p2) {
		if(p1.identifiant==p2.identifiant) {
			return true;
		}
		return false;
	}

	public int chercher(Magasin m, Produit p) {
	
		Listeproduit temp = m.getlisteproduits();
		while(temp!=null) {
			if (temp.produit.getIdentifiant()==p.identifiant) {
				return 1;
			}
			else {
				temp=temp.suivant;
			}
		}return 0;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
