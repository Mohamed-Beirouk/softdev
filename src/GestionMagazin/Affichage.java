package GestionMagazin;

public class Affichage {

	public static void main(String[] args) {

		Produit p1 = new Produit(1,"viande","allemange",400);
		Produit p2= new Produit(1,"poisson","maroc",800);
		Produit p3= new Produit(1,"banane","algerie",350);
		Produit p4= new Produit(1,"pomme","mauritanie",540);
		Produit p5= new Produit(1,"lait","espange",500);
		Produit p6= new Produit(1,"the","mauritanie",2200);
		Produit p7= new Produit(1,"mango","mauritanie",650);
		
		Listeproduit lp1 = null;
		lp1 = new Listeproduit(p1,lp1);
		Listeproduit lp2 = null;
		lp2 = new Listeproduit(p2,lp2);
		Listeproduit lp3 =null;
		lp3 = new Listeproduit(p3,lp3);
		Listeproduit lp4 =null;
		lp4 = new Listeproduit(p4,lp4);
		Listeproduit lp5 = null;
		lp5 = new Listeproduit(p5,lp5);
		Listeproduit lp6 = null;
		lp6 = new Listeproduit(p6,lp6);
		Listeproduit lp7 = null;
		lp7 = new Listeproduit(p7,lp7);
		
		lp1 = Listeproduit.ajouterDebut(lp1,lp2);
		lp1 = Listeproduit.ajouterDebut(lp1,lp3);
		lp1 = Listeproduit.ajouterDebut(lp1,lp4);
		lp1 = Listeproduit.ajouterDebut(lp1,lp5);
		lp1 = Listeproduit.ajouterDebut(lp1,lp6);
		lp1 = Listeproduit.ajouterDebut(lp1,lp7);
	
		
	}

}
