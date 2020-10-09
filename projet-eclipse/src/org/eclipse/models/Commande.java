package org.eclipse.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande{
	
	private int id;
	private Date dateComande;
	private Client client;	
	private float totalPrix;
	private List<LigneCommande> lignecommandes = new  ArrayList<>();	

	public Commande(int id, Date dateComande, Client client ) {		
		this.id = id;
		this.dateComande = dateComande;
		this.client = client;		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateComande() {
		return dateComande;
	}
	public void setDateComande(Date dateComande) {
		this.dateComande = dateComande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
		
	}
	
	public float getTotalPrix() {
		for(LigneCommande lcmd : lignecommandes) {
			totalPrix += lcmd.getPrix();
		}
		return totalPrix;
	}
	
	public void setTotalPrix(float totalPrix) {
		this.totalPrix = totalPrix;
	}
	public String toString() {
		return "Commande [id=" + id + ", dateComande=" + dateComande + ", Total=" + getTotalPrix()+ ", client=" + client + "]";
	}
	public List<LigneCommande> getLignecommandes() {
		return lignecommandes;
	}
	public void setLignecommandes(List<LigneCommande> lignecommandes) {
		this.lignecommandes = lignecommandes;
	}

	
}
