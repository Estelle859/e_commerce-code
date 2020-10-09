package org.eclipse.models;

public class LignePanier {
	
	private int id;
	private Panier panier;
	private Produit produit;
	private int quantiteProduit;
	
	public LignePanier(int id, Panier panier, Produit produit, int quantiteProduit) {	
		this.id = id;
		this.panier = panier;
		this.produit = produit;
		this.quantiteProduit = quantiteProduit;
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public int getQuantiteProduit() {
		return quantiteProduit;
	}

	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}


	@Override
	public String toString() {
		return "LignePanier [id=" + id + ", panier=" + panier + ", produit=" + produit + ", quantiteProduit="
				+ quantiteProduit + "]";
	}


	

}
