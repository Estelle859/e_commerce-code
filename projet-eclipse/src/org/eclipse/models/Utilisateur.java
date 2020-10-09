package org.eclipse.models;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
	
	private int id;
	private String nom;
	private String prenom;
	private String userNom;
	private String motDePasse;
	
	private List<Adresse> adresses = new ArrayList<>();
	
	public Utilisateur(int id, String nom, String prenom, String userNom, String motDePasse, List<Adresse> adresses) {
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.userNom = userNom;
		this.motDePasse = motDePasse;
		this.adresses = adresses;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserNom() {
		return userNom;
	}
	public void setUserNom(String userNom) {
		this.userNom = userNom;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public List<Adresse> getAdresses() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	@Override
	public String toString() {
		return "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", userNom=" + userNom
				+ ", motDePasse=" + motDePasse + ", adresses=" + adresses + "]";
	}
	
}
