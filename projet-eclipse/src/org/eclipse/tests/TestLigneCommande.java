package org.eclipse.tests;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.models.Adresse;
import org.eclipse.models.Client;
import org.eclipse.models.Commande;
import org.eclipse.models.LigneCommande;
import org.eclipse.models.Produit;
import org.eclipse.services.LigneCommandeService;

public class TestLigneCommande {
	
	public static void main(String[] args) {
	
		LigneCommandeService lcs = new LigneCommandeService();
		
		Date date = new Date();		
		Adresse ad = new Adresse(1, "ruea", "10000", "ville1");		
		List<Adresse> ads = new ArrayList<>();
		ads.add(ad);		
		Client client2 = new Client(3, "clinom12", "cliprenom12", "cliuserNom12", "climotDePasse12", ads);	
		Commande cmd1 = new Commande(1, date, client2);
		Produit produit1 = new Produit(1, "Acer Aspire 5 Slim Laptop" , 359, 5, "https://images-na.ssl-images-amazon.com/images/I/71vvXGmdKWL._AC_SL1500_.jpg");
		
		//creer une ligne de commande
		LigneCommande lcmd = new LigneCommande(1, 2,  produit1,  cmd1);		
		//ajouter une commnde dans la liste de commandes					
		System.out.println("sauvgarder dans la liste de ligne de commandes...");
		lcs.saveLigneCommande(lcmd);	
		
		//supprimer une commande
		lcs.removeLigneCommande(lcmd);
		System.out.println("consulter la Liste des commandes après suppression d'une ligne commande");
		for(LigneCommande ligneCommande : lcs.getAllLigneCommandes()) {
			System.out.println(ligneCommande);			
		}
		
		//rajouter ma commande
		lcs.saveLigneCommande(lcmd);
		System.out.println("consulter la Liste des commandes après ajouter d'une ligne commande");
		for(LigneCommande ligneCommande : lcs.getAllLigneCommandes()) {
			System.out.println(ligneCommande);			
		}		
		
		//modifier une commande
		LigneCommande lcmdU  = new LigneCommande(1, 2,  produit1,  cmd1);
		lcs.updateLigneCommande(lcmdU);
		
		//consulter les commandes
		System.out.println("Consulter la Liste des lignes de commandes");
		for(LigneCommande ligneCommande : lcs.getAllLigneCommandes()) {
			System.out.println(ligneCommande);			
		}
	}

}
