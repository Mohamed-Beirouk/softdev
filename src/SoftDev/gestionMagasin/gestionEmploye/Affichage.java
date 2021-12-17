package SoftDev.gestionMagasin.gestionEmploye;
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
		
		
		Caissier c1 = new Caissier(2, "mohamed", "teyarett", 200,  0001);
		Caissier c2 = new Caissier(1, "beirouk", "premier", 140, 0002);
		Vendeur v1 = new Vendeur(3, "medos", "kebbe", 300, 0.6);
		Responsable r1 = new Responsable(4,"badi","maghtaa lahjar",100,20000.0);
		
		Listecaissier lc = null;
		Listecaissier lc1 = null;
		lc1 = new Listecaissier(c1,lc1);
		lc = Listecaissier.ajouterDebut(lc,lc1);
		
		Listecaissier lc2 = null;
		lc2 = new Listecaissier(c2,lc2);
		lc = Listecaissier.ajouterDebut(lc,lc2);
		
		Listevendeurs lv = null;
		Listevendeurs lv1 = null;
		lv1 = new Listevendeurs(v1,lv1);
		lv = Listevendeurs.ajouterDebut(lv,lv1);
		
		Listeresponsable lr = null;
		Listeresponsable lr1 = null;
		lr1 = new Listeresponsable(r1,lr1);
		lr = Listeresponsable.ajouterDebut(lr,lr1);
		
		System.out.println("-----     magasin m1   -------------\n \n");
		Magasin m1 = new Magasin(10,"Bon prix - El mina",300,lp,lc,lv,lr);
		m1.afficherMagsin();
		
		double calc1 =c1.CalculeSalaire();
		double calc2 =c2.CalculeSalaire();
		double calv1 =v1.CalculeSalaire();
		double calr1 =r1.CalculeSalaire();
		System.out.println("\n la salaire de caissier 1 est : "+calc1);
		System.out.println(" la salaire de caissier 2 est : "+calc2);
		System.out.println(" la salaire de vendeur 1 est : "+calv1);
		System.out.println(" la salaire de responsable 1 est : "+calr1);
		
		
		System.out.println("------      magasin m2   -------------\n \n");
		
		Caissier c3 = new Caissier(30, "sidii", "atar", 80, 0005);
		Vendeur v2 = new Vendeur(40, "khaled", "hok", 85, 0.7);
		Vendeur v3 = new Vendeur(99, "Moh", "Et tarhil", 90, 0.4);
		Vendeur v4 = new Vendeur(20, "sii", "b3id", 32, 0.4);
		Responsable r2 = new Responsable(94,"Amadou","Tevragh zeina",111,300.0);
		

		Listecaissier lc9 = null;
		Listecaissier lc10 = null;
		lc10 = new Listecaissier(c3,lc10);
		lc9 = Listecaissier.ajouterDebut2(lc9,lc10);
		

		Listevendeurs lvv = null;
		Listevendeurs lv2 = null;
		lv2 = new Listevendeurs(v2,lv2);
		lvv = Listevendeurs.ajouterDebut2(lvv,lv2);
		
		Listevendeurs lv3 = null;
		lv3 = new Listevendeurs(v3,lv3);
		lvv = Listevendeurs.ajouterDebut2(lvv,lv3);
		
		Listevendeurs lv4 = null;
		lv4 = new Listevendeurs(v4,lv4);
		lvv = Listevendeurs.ajouterDebut2(lvv,lv4);
		
		Listeresponsable lrr = null;
		Listeresponsable lr2 = null;
		lr2 = new Listeresponsable(r2,lr2);
		lrr = Listeresponsable.ajouterDebut2(lrr,lr2);
		
		
		Magasin m2 = new Magasin(20,"monoprix tevragh zeina",300,lp,lc9,lvv,lrr);

		
		
		
		double c11 =c3.CalculeSalaire();
		
		double calv11 =v2.CalculeSalaire();
		double calv12 =v3.CalculeSalaire();
		double calv13 =v4.CalculeSalaire();
		
		double calr11 =r2.CalculeSalaire();
		m2.afficherMagsin();
		System.out.println(" \nle salaire de caissier 1 est : "+c11);
		
		System.out.println(" le salaire de vendeur 1 est : "+calv11);
		System.out.println(" le salaire de vendeur 2 est : "+calv12);
		System.out.println(" le salaire de vendeur 3 est : "+calv13);
		
		System.out.println(" le salire de responsable 1 est : "+calr11);
		
		
		
		
		
//		m2.comparerproduitesmagasin(m1,m2);
//		System.out.println("-------------------------\n \n");
		
//		Produit p = new Produit();
//		boolean x = p.comparer(lp.produit, lp.suivant.produit);
//		System.out.println("comparer p1 et p2 : "+x);
//		System.out.println("-------------------------\n \n");
//		
//		int z = p.chercher(m1, lp.suivant.produit);
//		System.out.println("chercher p2 dans magasin m1 : "+z);
		
//		System.out.println("-------------------------\n \n");
//		listStore ls = null;
//		listStore ls2 = null;
//		ls = new listStore(m1,ls);
//		ls2 = new listStore(m1,ls2);
//		ls = listStore.ajouterDebut(ls,ls);
//		ls = listStore.ajouterDebut(ls,ls2);
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
