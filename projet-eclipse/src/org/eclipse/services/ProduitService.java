package org.eclipse.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.models.Produit;


public class ProduitService {
	
	List<Produit> produits = new ArrayList<>();
	
	public ProduitService() {
		Produit p1 = new Produit(1, "Acer Aspire 5 Slim Laptop" , 359, 2, "https://images-na.ssl-images-amazon.com/images/I/71vvXGmdKWL._AC_SL1500_.jpg");
		Produit p2 = new Produit(2, "Toshiba TF-55A810U21 55-inch ",260,8,"https://images-na.ssl-images-amazon.com/images/I/61xU%2BHbHJyL._AC_SL1000_.jpg");
		Produit p3 = new Produit(3,"Canon PowerShot SX530 Digital Camera ",200,4,"https://images-na.ssl-images-amazon.com/images/I/61xeTmAQDNL._AC_SL1500_.jpg");								
		Produit p4 = new Produit(4,"Samsung Galaxy S20 FE 5G",599,6,"https://images-na.ssl-images-amazon.com/images/I/712PXMEDp4L._AC_SL1500_.jpg");

		produits.addAll(Arrays.asList(p1,p2,p3,p4));
	}
	public void saveProduct(Produit produit) {	
		produits.add(produit);
		
	}	
	public void removeProduct(Produit produit) {
		produits.remove(produit);
	}
	public void updateProduct(Produit produit) {		
		for(Produit p : produits) {		
			if(p.getId()==produit.getId()) {
				System.out.println("UPDATING..." );
				p.setDesignation(produit.getDesignation());
				p.setQuantiteEnStock(produit.getQuantiteEnStock());
				p.setPrixUnitaire(produit.getPrixUnitaire());
				p.setUrlImage(produit.getUrlImage());
				
				//p = produit;
				
			}
		}
		
	}	
	public List<Produit> getAllProducts() {
        return produits;
    }
	public void  setAllProducts(List<Produit> listeproduits) {
        produits = listeproduits;
    }
	
	public Produit findByIdProduct(int produitId) {
		for(Produit p : produits) {
			if(produitId == p.getId()) return p;
		}
		//System.out.println(produits.get(produitId));
		//return produits.get(produitId);
		return null;
	}
	
	public ArrayList<Produit> findByQuantiteEnStock() {
        ArrayList<Produit> disponibles = new ArrayList<>();
        for (Produit produit : produits) {
            if (produit.getQuantiteEnStock() > 0) {
                disponibles.add(produit);
            }
        }
        return disponibles;
	}

}
