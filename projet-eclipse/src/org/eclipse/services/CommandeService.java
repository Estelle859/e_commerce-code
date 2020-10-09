package org.eclipse.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.eclipse.models.Adresse;
import org.eclipse.models.Client;
import org.eclipse.models.Commande;


public class CommandeService {
	
	List<Commande> commandes = new ArrayList<>();
	
	public CommandeService() {		
		Date date = new Date();
		Adresse ad1 = new Adresse(1, "ruea", "10000", "ville1");
		List<Adresse> adresses = new ArrayList<>();
		adresses.add(ad1);
		Client client = new Client(3, "clinom1", "cliprenom1", "cliuserNom1", "climotDePasse1", adresses);	
		Client client2 = new Client(3, "clinom12", "cliprenom12", "cliuserNom12", "climotDePasse12", adresses);	
		Commande cmd1 = new Commande(1, date, client);	
		Commande cmd2 = new Commande(2, date, client2);	
		commandes.addAll(Arrays.asList(cmd1,cmd2));
	}
	
	public void saveCommande(Commande commande) {	
		commandes.add(commande);
		
	}	
	public void removeCommande(Commande cmd) {
		commandes.remove(cmd);
	}
	public void updateCommande(Commande commande) {		
		for(Commande c : commandes) {		
			if(c.getId() == commande.getId()) {
				System.out.println("UPDATING..." );	
				c=commande;			
			}
		}
		
	}
	public List<Commande> getAllCommandes() {
        return commandes;
    }
	public Commande findByIdCommande(int commandeId) {
		for(Commande c : commandes) {
			if(commandeId == c.getId()) return c;
		}
		return null;
	}	


}
