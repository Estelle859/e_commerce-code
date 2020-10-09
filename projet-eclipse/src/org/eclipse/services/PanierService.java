package org.eclipse.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.models.Adresse;
import org.eclipse.models.Client;
import org.eclipse.models.Panier;
import org.eclipse.models.Produit;

public class PanierService {
	
	List<Panier> paniers = new ArrayList<>();
	public PanierService() {
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
		paniers.addAll(Arrays.asList(pan1,pan2));
	}
	
	public void savePanier(Panier panier) {	
		paniers.add(panier);
		
	}	
	public void removePanier(Panier panier) {
		paniers.remove(panier);
	}
	public void updatePanier(Panier panier) {		
		for(Panier pan : paniers) {		
			if(pan.getId()==panier.getId()) {
				System.out.println("UPDATING..." );			
				pan.setClient(panier.getClient());		
				
			}
		}
		
	}
	public Panier findByIdPanier(int panierId) {
		for(Panier pan : paniers) {
			if(panierId == pan.getId()) return pan;
		}	
		return null;
	}
	public List<Panier> getPaniers() {
		return paniers;
	}
	public void setPaniers(List<Panier> paniers) {
		this.paniers = paniers;
	}	

}
