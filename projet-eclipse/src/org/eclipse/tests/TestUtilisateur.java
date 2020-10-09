package org.eclipse.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.models.Adresse;
import org.eclipse.models.Client;
import org.eclipse.models.Produit;
import org.eclipse.models.Utilisateur;
import org.eclipse.models.Vendeur;
import org.eclipse.services.ProduitService;
import org.eclipse.services.UtilisateurService;

public class TestUtilisateur {

	public static void main(String[] args) {
		
		UtilisateurService userService = new UtilisateurService();
		ProduitService ps = new ProduitService();
		//Creer les adresse
		Adresse ad1 = new Adresse(1, "ruea", "10000", "ville1");
		Adresse ad2 = new Adresse(2, "rueb", "10001", "ville2");
		List<Adresse> adresses1 = new ArrayList<>();
		List<Adresse> adresses2 = new ArrayList<>();
		//ajouter des adresses dans la liste adresses
		adresses1.add(ad1);
		adresses1.add(ad2);		
		Adresse ad3 = new Adresse(3, "ruec", "10002", "ville3");
		Adresse ad4 = new Adresse(4, "rued", "10003", "ville4");
		adresses2.add(ad3);
		adresses2.add(ad4);		
		//creeer utilistaeurs
		Utilisateur user1 = new Utilisateur(1,"nom1", "prenom1", "userNom1", "mdp1", adresses1);
		Utilisateur user2 = new Utilisateur(2,"nom2", "prenom2", "userNom2", "mdp2", adresses2);	
		//creer les clients
		Client cli1 = new Client(3, "clinom1", "cliprenom1", "cliuserNom1", "climotDePasse1", adresses1);
		Client cli2 = new Client(4, "clinom2", "cliprenom2", "cliuserNom2", "climotDePasse2", adresses2);
		
		Produit p1 = new Produit(8, "Fait maison - numéro 1 Par Cyril Lignac " , 12, 10, "https://d2svrcwl6l7hz1.cloudfront.net/content/B0897TJ6B3/resources/0?mime=image/*");
		Produit p2 = new Produit(9, "One Piece - Édition originale ",10,8,"https://images-na.ssl-images-amazon.com/images/I/91w0-XAit5L.jpg");
			
		//ajouter produit dans la liste de produits					
		System.out.println("sauvgarder dans le liste produits...");
		ps.saveProduct(p1);
		ps.saveProduct(p2);
		
		System.out.println("getting products for vendeur** " +ps.getAllProducts());
		//creer les vendeurs
		Vendeur v1 = new Vendeur(5, "vendnom1", "vendprenom1", "venduserNom1", "vendmotDePasse1", adresses1,ps.getAllProducts());
		Vendeur v2 = new Vendeur(6, "vennom2", "vendprenom2", "venduserNom2", "vendmotDePasse2", adresses2,ps.getAllProducts());
		//sauvgarder tous les users dans la liste de users inclus les clients et les vendeurs
		userService.saveUser(user1);
		userService.saveUser(user2);
		userService.saveUser(cli1);
		userService.saveUser(cli2);
		userService.saveUser(v1);
		userService.saveUser(v2);
		
		//consulter la liste de users
		System.out.println("consulter les user list");	
		for(Utilisateur user : userService.getAllUsers()) {		
			System.out.println(user);			
		}	
		//supprimer un user de la liste des users
		System.out.println("deleting an user");
		userService.removeUser(cli1);
		//ajouter un user à la liste des users
		System.out.println("adding deleted client");
		userService.saveUser(cli1);
		//modifier un user
		System.out.println("updating the user");
		Utilisateur newUser = new Utilisateur(1, "newnom", "newprenom", "newuserNom", "newmotDePasse", adresses1);
		userService.updateUser(newUser );
		//verifier si l'user modifie
		System.out.println("finding a user by id");	
		System.out.println(userService.findByIdUser(2));		
		
		//chercher un user par son user login and  password
		System.out.println("finding a user by son login and mot de passe");	
		System.out.println(userService.findByLoginAndPassword("venduserNom1","vendmotDePasse1"));

	}

}
