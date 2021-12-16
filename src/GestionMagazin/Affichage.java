package GestionMagazin;
import java.util.Scanner;

public class Affichage {

	public static void main(String[] args) throws Produitexception, prixProduitException {
		int choix = 1;
		Listeproduit lp = null;
		Scanner ss = new Scanner(System.in);
		do {
		Produit p1 = new Produit();
		try  {
			p1.SaisirProduit();
		}
		catch(prixProduitException e) {
			System.out.println("impossible, le produit ne peut pas etre negative !");
		}	
		Listeproduit lp1 = null;
		lp1 = new Listeproduit(p1,lp1);
		try {
			lp = Listeproduit.ajouterDebut(lp,lp1);
		}catch(Produitexception w) {	
			System.out.println("\n\nimpossible, maximum nbre de produits est 5 !");}
		System.out.println("-------------------------\n \n");
		
		System.out.println("voulez vous ajouter un autre produit? \ntaper ( 1 ) pour ajouter ou une autre touche pour quitter. ");
		choix = ss.nextInt();
		}while(choix==1);
		
		
		System.out.println("-------------------------\n \n");
		Magasin m1 = new Magasin(1,"nktt magasin",300,lp);
		m1.afficherMagsin();
		System.out.println("-------------------------\n \n");
		
		Magasin m2 = new Magasin(2,"kiffa magasin",300,lp);
		m2.comparerproduitesmagasin(m1,m2);
		System.out.println("-------------------------\n \n");
		System.out.println("-------------------------\n \n");
		Produit p = new Produit();
		boolean x = p.comparer(lp.produit, lp.suivant.produit);
		System.out.println("comparer p1 et p2 : "+x);
		System.out.println("-------------------------\n \n");
		
		int z = p.chercher(m1, lp.suivant.produit);
		System.out.println("chercher p2 dans magasin m1 : "+z);
		
		System.out.println("-------------------------\n \n");
		listStore ls = null;
		listStore ls2 = null;
		ls = new listStore(m1,ls);
		ls2 = new listStore(m1,ls2);
		ls = listStore.ajouterDebut(ls,ls);
		ls = listStore.ajouterDebut(ls,ls2);
//		System.out.println("---- nombre produits total dans ls----------\n \n");
//		int xx = ls.NbrProdtotal(ls);
//		System.out.println("nombre de p dans ls est : "+xx);
//		ls.affichage(ls);
//		System.out.println("----------apres suppression---------------\n \n");
//		lp=lp.supprimerproduit(p,lp);
//		p=m1.getlisteproduits().suivant.produit;
//		
//		
//		m1.afficherMagsin();
		
//		int ww;
//		ww = ls.NbrProdtotal(ls);
//		System.out.println("------nombre ttal des produits dans la liststore est ------"+ww);
		
//		System.out.println("le produit p2 : ");
//		Produit p2= new Produit();
//		try  {
//			p2.SaisirProduit();
//		}
//		catch(prixProduitException e) {
//			System.out.println("impossible, le produit ne peut pas etre negative !");
//		}	
//		Listeproduit lp2 = null;
//		lp2 = new Listeproduit(p2,lp2);
//		lp1 = Listeproduit.ajouterDebut(lp1,lp2);
//		
//		
//		System.out.println("le produit p3 : ");
//		Produit p3 = new Produit();
//		try  {
//			p3.SaisirProduit();
//		}
//		catch(prixProduitException e) {
//			System.out.println("impossible, le produit ne peut pas etre negative !");
//		}	
//		
//		Listeproduit lp3 =null;
//		lp3 = new Listeproduit(p3,lp3);
		
//		System.out.println("le produit p4 : ");
//		Produit p4= new Produit();
//		try  {
//			p4.SaisirProduit();
//		}
//		catch(prixProduitException e) {
//			System.out.println("impossible, le produit ne peut pas etre negative !");
//		}	
//		Listeproduit lp4 =null;
//		lp4 = new Listeproduit(p4,lp4);
//		
//		System.out.println("le produit p5 : ");
//		Produit p5= new Produit();
//		try  {
//			p5.SaisirProduit();
//		}
//		catch(prixProduitException e) {
//			System.out.println("impossible, le produit ne peut pas etre negative !");
//		}	
//		Listeproduit lp5 = null;
//		lp5 = new Listeproduit(p5,lp5);
//		
//		System.out.println("le produit p6 : ");
//		Produit p6= new Produit();
//		try  {
//			p6.SaisirProduit();
//		}
//		catch(prixProduitException e) {
//			System.out.println("impossible, le produit ne peut pas etre negative !");
//		}	
//		Listeproduit lp6 = null;
//		lp6 = new Listeproduit(p6,lp6);
//		
//		System.out.println("le produit p7 : ");
//		Produit p7= new Produit();
//		try  {
//			p7.SaisirProduit();
//		}
//		catch(prixProduitException e) {
//			System.out.println("impossible, le produit ne peut pas etre negative !");
//		}	
//		Listeproduit lp7 = null;
//		lp7 = new Listeproduit(p7,lp7);
//		
//		lp1 = Listeproduit.ajouterDebut(lp1,lp2);
//		lp1 = Listeproduit.ajouterDebut(lp1,lp3);
//		lp1 = Listeproduit.ajouterDebut(lp1,lp4);
//		lp1 = Listeproduit.ajouterDebut(lp1,lp5);

//		try {
//			Magasin m1 = new Magasin(1,"r7-3",300,lp1);
//			m1.afficherMagsin();
//		}
//		catch(Produitexception e) {
//			System.out.println("impossible, maximum nbre de produits est 5 !");
//		}	
 		
		
		
//		try {
//			lp1 = Listeproduit.ajouterDebut(lp1,lp7);
// 	 		lp1 = Listeproduit.ajouterDebut(lp1,lp6);
//			}
//		catch(Produitexception w) {
//			
//			System.out.println("\n\nimpossible, maximum nbre de produits est 5 !");
//			
//		}	
		
		
		
		
		
	}
}
