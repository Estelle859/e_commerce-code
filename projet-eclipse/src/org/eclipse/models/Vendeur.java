package org.eclipse.models;

import java.util.ArrayList;
import java.util.List;

public class Vendeur extends Utilisateur{
	
	private List<Produit> produits = new ArrayList<>();
	
	public Vendeur(int id, String nom, String prenom, String userNom, String motDePasse, List<Adresse> adresses,
			List<Produit> produits) {
		super(id, nom, prenom, userNom, motDePasse, adresses);
		this.produits = produits;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}


	public String toString() {
		return "id=" + super.getId() + ", nom=" + super.getNom() + ", prenom=" + super.getPrenom() + ", userNom=" + super.getUserNom()
				+ ", motDePasse=" + super.getMotDePasse() + ", adresses=" + super.getAdresses() + ", produits=" + produits+"]";
	}
	
}
