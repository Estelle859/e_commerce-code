package org.eclipse.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.eclipse.models.Adresse;
import org.eclipse.models.Client;
import org.eclipse.models.Commande;
import org.eclipse.models.LigneCommande;
import org.eclipse.models.Produit;

public class LigneCommandeService {
	
	List<LigneCommande> lignecommandes = new ArrayList<>();
	
	public LigneCommandeService() {
		Date date = new Date();		
		Adresse ad = new Adresse(1, "ruea", "10000", "ville1");		
		List<Adresse> ads = new ArrayList<>();
		ads.add(ad);		
		Client client2 = new Client(3, "clinom12", "cliprenom12", "cliuserNom12", "climotDePasse12", ads);	
		Commande cmd1 = new Commande(1, date, client2);
		Commande cmd2 = new Commande(2, date, client2);	
		Commande cmd3 = new Commande(3, date, client2);	
		Produit produit1 = new Produit(1, "Acer Aspire 5 Slim Laptop" , 359, 5, "https://images-na.ssl-images-amazon.com/images/I/71vvXGmdKWL._AC_SL1500_.jpg");
		Produit produit3 = new Produit(3,"Canon PowerShot SX530 Digital Camera ",200,4,"https://images-na.ssl-images-amazon.com/images/I/61xeTmAQDNL._AC_SL1500_.jpg");								
		Produit produit4 = new Produit(4,"Samsung Galaxy S20 FE 5G",599,6,"https://images-na.ssl-images-amazon.com/images/I/712PXMEDp4L._AC_SL1500_.jpg");
		//creer une ligne de commande
		LigneCommande lcmd1 = new LigneCommande(1, 2,  produit1,  cmd1);
		LigneCommande lcmd2 = new LigneCommande(2, 2,  produit3,  cmd2);
		LigneCommande lcmd3 = new LigneCommande(3, 2,  produit4,  cmd3);
		lignecommandes.addAll(Arrays.asList(lcmd1,lcmd2,lcmd3));
	}
	public void saveLigneCommande(LigneCommande lcmd) {	
		lignecommandes.add(lcmd);
		
	}	
	public void removeLigneCommande(LigneCommande lcmd) {
		lignecommandes.remove(lcmd);
	}
	public void updateLigneCommande(LigneCommande lcmd) {		
		for(LigneCommande lc : lignecommandes) {		
			if(lc.getId() == lcmd.getId()) {
				System.out.println("UPDATING..." );	
				lc=lcmd;
							
			}
		}		
	}
	public List<LigneCommande> getAllLigneCommandes() {
        return lignecommandes;
    }	

	public void setLignecommandes(List<LigneCommande> lignecommandes) {
		this.lignecommandes = lignecommandes;
	}
	
	public LigneCommande findByIdCommande(int lcmdId) {
		for(LigneCommande lc :  lignecommandes) {
			if(lcmdId == lc.getId()) return lc;
		}
		return null;
	}	
	

}
