package org.eclipse.models;

public class Produit {
	
	private int id;
	private String designation;
	private float prixUnitaire;
	private int quantiteEnStock;
	private String urlImage;
	
	
	public Produit() {
		
	}

	public Produit(int id, String designation, float prixUnitaire, int quantiteEnStock, String urlImage) {
	
		this.id = id;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.quantiteEnStock = quantiteEnStock;
		this.urlImage = urlImage;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public int getQuantiteEnStock() {
		return quantiteEnStock;
	}
	public void setQuantiteEnStock(int quantiteEnStock) {
		this.quantiteEnStock = quantiteEnStock;
	}

	public String getUrlImage() {
		return urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	
	@Override
	public String toString() {
		return "Produit [id=" + id + ", designation=" + designation + ", prixUnitaire=" + prixUnitaire
				+ ", quantiteEnStock=" + quantiteEnStock + ", urlImage=" + urlImage + "]";
	}
	

}
