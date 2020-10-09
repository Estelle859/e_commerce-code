package org.eclipse.models;

public class LigneCommande {
	
	private int id;
	private int quantiteCommande;
	private Produit produit;
	private Commande commande;
	
	public LigneCommande(int id, int quantiteCommande, Produit produit, Commande commande) {	
		this.id = id;
		this.quantiteCommande = quantiteCommande;
		this.produit = produit;
		this.commande = commande;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantiteCommande() {
		return quantiteCommande;
	}
	public void setQuantiteCommande(int quantiteCommande) {
		this.quantiteCommande = quantiteCommande;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public float getPrix() {
		//calcule de prix de prixUnitaire * quantite commande
		float prix = produit.getPrixUnitaire()*this.quantiteCommande ;		
		return prix;
	}
		
	@Override
	public String toString() {
		return "LigneCommande [id-lignecommande=" + id + ",commande-id=" + commande.getId()+", quantiteCommande=" + quantiteCommande + ", produit=" 
				+ produit.getDesignation()	+", prix=" + getPrix() +"]";
	}



}
