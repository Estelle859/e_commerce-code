package org.eclipse.tests;

import org.eclipse.models.Produit;
import org.eclipse.services.ProduitService;

public class TestProduit {
	
	public static void main(String[] args) {
		
		ProduitService ps = new ProduitService();
		Produit p1 = new Produit(1, "Acer Aspire 5 Slim Laptop" , 359, 2, "https://images-na.ssl-images-amazon.com/images/I/71vvXGmdKWL._AC_SL1500_.jpg");
		Produit p2 = new Produit(2, "Toshiba TF-55A810U21 55-inch ",260,8,"https://images-na.ssl-images-amazon.com/images/I/61xU%2BHbHJyL._AC_SL1000_.jpg");
		Produit p3 = new Produit(3,"Canon PowerShot SX530 Digital Camera ",200,4,"https://images-na.ssl-images-amazon.com/images/I/61xeTmAQDNL._AC_SL1500_.jpg");								
		Produit p4 = new Produit(4,"Samsung Galaxy S20 FE 5G",599,6,"https://images-na.ssl-images-amazon.com/images/I/712PXMEDp4L._AC_SL1500_.jpg");	
		
		//ajouter produit dans la liste de produits					
		System.out.println("sauvgarder dans le liste produits...");
		ps.saveProduct(p1);
		ps.saveProduct(p2);
		ps.saveProduct(p3);
		ps.saveProduct(p4);	
		//Consulter tous les produits
		for(Produit produit : ps.getAllProducts()) {		
			System.out.println(produit);			
		}
		//supprimer un produit de la liste de produits
		System.out.println("supprimer un produit");										
		ps.removeProduct(p4);		
		for(Produit produit : ps.getAllProducts()) {			
			System.out.println(produit);
					
		}
		//rajouter le produit supprimer
		ps.saveProduct(p4);
		//modifier le produits 
		System.out.println("modifier un produit");		
		Produit p5 = new Produit(3,"Canon PowerShot SX530 Digital Camera ",520,20,"https://images-na.ssl-images-amazon.com/images/I/61xeTmAQDNL._AC_SL1500_.jpg");
		//p5.setQuantiteEnStock(25);
		ps.updateProduct(p5);
		//verifier si le produit modifié par trouver son id 
		//Chercher un produit par son id
		System.out.println(ps.findByIdProduct(3));	
		System.out.println("touver les produits en stock...");
		System.out.println(ps.findByQuantiteEnStock());		
		
	

	}

}
