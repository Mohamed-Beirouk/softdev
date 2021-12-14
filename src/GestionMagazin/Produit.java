package GestionMagazin;
import java.util.Scanner;

public class Produit {
	
	private int identifiant;
	private String libelle;
	private String marque;
	private float prix;

	public Produit(int identifiant, String libelle, String marque, float prix) {
		this.identifiant=identifiant;
		this.libelle=libelle;
		this.marque=marque;
		this.prix=prix;
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

	public void SaisirProduit() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("donner identifiant du produit :");
		this.identifiant=sc.nextInt();
		
		System.out.println("donner le libelle du produit:");
		this.libelle=sc.nextLine();
		
		System.out.println("donner la marque du produit :");
		this.marque=sc.nextLine();
		
		
		
		System.out.println("donner le prix :");
		this.prix=sc.nextFloat();
		sc.close();
	}
	
	
	public void AfficherProduit() {
		
		System.out.println("id :"+this.identifiant);
		System.out.println("nom :"+this.libelle);
		System.out.println("prenom :"+this.marque);		
		System.out.println("lieunaiss :"+this.prix);
	}

	

}
