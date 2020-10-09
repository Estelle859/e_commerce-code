package org.eclipse.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.models.Adresse;
import org.eclipse.models.Client;
import org.eclipse.models.Panier;

import org.eclipse.services.PanierService;

public class TestPanier {
	
	public static void main(String[] args) {
		
		PanierService pans = new PanierService();
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
		
		//ajouter un panier dans la liste de paniers					
		System.out.println("sauvgarder panier dans le liste paniers...");
		pans.savePanier(pan1);
		pans.savePanier(pan2);
		//consulter les commandes
		System.out.println("Liste des paniers");
		for(Panier panier : pans.getPaniers()) {
			System.out.println(panier);			
		}	
		//supprimer une commande
		pans.removePanier(pan1);
		System.out.println("Liste des paniers après suppression d'un panier");
		for(Panier panier : pans.getPaniers()) {
			System.out.println(panier);			
		}
		//rajouter pan1 dans la liste
		pans.savePanier(pan1);
		Panier panU  = new Panier(2,client1);
		//modifier une commande
		pans.updatePanier(panU);
		//consulter les commandes
		System.out.println("Liste des paniers");
		for(Panier panier : pans.getPaniers()) {
			System.out.println(panier);			
		}			
	}


}
