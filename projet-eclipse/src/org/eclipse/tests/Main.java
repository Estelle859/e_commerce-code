package org.eclipse.tests;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.eclipse.models.Produit;
import org.eclipse.services.ProduitService;




public class Main {

	public static void main(String[] args) {
		
		System.out.println("Tapez 1.si vous etes Client 2.si vous etes Vendeur 3.Quit");
		ProduitService ps = new ProduitService();	
		List<Produit> produits = ps.getAllProducts();		
		
	
		try (Scanner sc = new Scanner(System.in)) {
			int userChoice1 = sc.nextInt();
			switch (userChoice1) {
				case 1:
					System.out.println("Menu Client");
					System.out.println("Tapez 1.ConsulterProduits 2.CommanderProduit 3.ConsulterPanier");	
								
					int userChoice2 = sc.nextInt();
					switch (userChoice2) {
					case 1:
						{
							System.out.println("ConsulterProduits");							
							for(Produit prod : produits) {		
								System.out.println(prod);			
							}
							break;
						}
					case 2:
						{
							System.out.println("Ajouter un Produit dans le panier");	
							
							break;
						}
					case 3:
						{
							System.out.println("ConsulterPanier");
							break;
						}
					case 4:
						{
							System.out.println("ConsulterPanier");
							break;
						}
					case 5:
						{
							
							break;
						}

					default:
						break;
					}
					break;
				case 2:
					System.out.println("Menu Vendeur");	
					System.out.println("Tapez 1.addProduit 2.deleteProduit 3.updateProduit 4.getAllProduits 5.getProduitById 6.Quit");					
	
					break;

				default:
					break;
			}
		}		
		
		
	}

}
