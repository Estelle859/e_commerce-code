package org.eclipse.tests;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.models.Adresse;
import org.eclipse.models.Client;
import org.eclipse.models.Commande;
import org.eclipse.services.CommandeService;

public class TestCommande {
	
	public static void main(String[] args) {
		
		CommandeService cs = new CommandeService();
		Date date = new Date();
		Adresse ad1 = new Adresse(1, "ruea", "10000", "ville1");
		List<Adresse> adresses = new ArrayList<>();
		adresses.add(ad1);
		Client client = new Client(3, "clinom1", "cliprenom1", "cliuserNom1", "climotDePasse1", adresses);	
		Client client2 = new Client(3, "clinom12", "cliprenom12", "cliuserNom12", "climotDePasse12", adresses);
	
		Commande cmd = new Commande(1, date, client);			
		//ajouter une commnde dans la liste de commandes					
		System.out.println("sauvgarder dans le liste commandes...");
		cs.saveCommande(cmd);
		//consulter les commandes
		System.out.println("Liste des commandes");
		for(Commande commande : cs.getAllCommandes()) {
			System.out.println(commande);			
		}
		//supprimer une commande
		cs.removeCommande(cmd);
		System.out.println("Liste des commandes après suppression d'une commande");
		for(Commande commande : cs.getAllCommandes()) {
			System.out.println(commande);			
		}
		//rajouter ma commande
		cs.saveCommande(cmd);
		System.out.println("Liste des commandes après ajouter d'une commande");
		for(Commande commande : cs.getAllCommandes()) {
			System.out.println(commande);			
		}
		 Commande cmdU  = new Commande(1, date, client2);
		//modifier une commande
		cs.updateCommande(cmdU);
		//consulter les commandes
		System.out.println("Liste des commandes");
		for(Commande commande : cs.getAllCommandes()) {
			System.out.println(commande);			
		}
		
		
		

	}

}
