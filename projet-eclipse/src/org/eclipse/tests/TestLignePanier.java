package org.eclipse.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.models.Adresse;
import org.eclipse.models.Client;
import org.eclipse.models.LignePanier;
import org.eclipse.models.Panier;
import org.eclipse.models.Produit;
import org.eclipse.services.LignePanierService;

public class TestLignePanier {

	public static void main(String[] args) {
		
		LignePanierService lnpans = new LignePanierService();
		
		Adresse ad1 = new Adresse(1, "ruea", "10000", "ville1");
		Adresse ad2 = new Adresse(2, "rueb", "10001", "ville2");
		List<Adresse> adresses1 = new ArrayList<>();
		List<Adresse> adresses2 = new ArrayList<>();
		adresses1.add(ad1);
		adresses2.add(ad2);
		
		Client client1 = new Client(3, "clinom1", "cliprenom1", "cliuserNom1", "climotDePasse1", adresses1);	
		Client client2 = new Client(4, "clinom2", "cliprenom2", "cliuserNom2", "climotDePasse2", adresses2);
		
		Panier pan1 = new Panier(1, client1);
		Panier pan2 = new Panier(2, client2);
		
		Produit p1 = new Produit(1, "Acer Aspire 5 Slim Laptop" , 359, 2, "https://images-na.ssl-images-amazon.com/images/I/71vvXGmdKWL._AC_SL1500_.jpg");
		Produit p2 = new Produit(2, "Toshiba TF-55A810U21 55-inch ",260,8,"https://images-na.ssl-images-amazon.com/images/I/61xU%2BHbHJyL._AC_SL1000_.jpg");
		Produit p3 = new Produit(3,"Canon PowerShot SX530 Digital Camera ",200,4,"https://images-na.ssl-images-amazon.com/images/I/61xeTmAQDNL._AC_SL1500_.jpg");								
		Produit p4 = new Produit(4,"Samsung Galaxy S20 FE 5G",599,6,"https://images-na.ssl-images-amazon.com/images/I/712PXMEDp4L._AC_SL1500_.jpg");	
		
		LignePanier lnpan1 = new LignePanier(1, pan1, p1, 5);		
		LignePanier lnpan2 = new LignePanier(2, pan2, p2, 3);
		LignePanier lnpan3 = new LignePanier(3, pan2, p3, 10);
		LignePanier lnpan4 = new LignePanier(4, pan1, p4, 7);
		
		
		//ajouter une lignepanier dans la liste de lignepaniers					
		System.out.println("sauvgarder lignepanier dans le liste lignepaniers...");
		lnpans.saveLignePanier(lnpan1);
		lnpans.saveLignePanier(lnpan2);
		lnpans.saveLignePanier(lnpan3);
		lnpans.saveLignePanier(lnpan4);
		
		//consulter les lignepaniers
		System.out.println("Liste des lignepaniers");
		for(LignePanier lnpanier : lnpans.getLignePaniers()) {
			System.out.println(lnpanier);			
		}	
		
		//supprimer une commande
		lnpans.removeLignePanier(lnpan1);
		System.out.println("Liste des paniers après suppression d'un panier");
		for(LignePanier panier : lnpans.getLignePaniers()) {
			System.out.println(panier);			
		}
		//rajouter pan1 dans la liste
		lnpans.saveLignePanier(lnpan1);
		LignePanier panU  =  new LignePanier(2, pan2, p3, 5);
		
		//modifier une commande
		lnpans.updateLignePanier(panU);
		//consulter les commandes
		System.out.println("Liste des paniers");
		for(LignePanier lnpanier : lnpans.getLignePaniers()) {
			System.out.println(lnpanier);			
		}			
	}

	

}
