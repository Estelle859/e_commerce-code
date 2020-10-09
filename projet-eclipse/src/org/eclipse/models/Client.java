package org.eclipse.models;

import java.util.List;

public class Client extends Utilisateur{

	public Client(int id, String nom, String prenom, String userNom, String motDePasse, List<Adresse> adresses) {
		super(id, nom, prenom, userNom, motDePasse, adresses);		
	}

	@Override
	public String toString() {
		return "id=" + super.getId() + ", nom=" + super.getNom() + ", prenom=" + super.getPrenom() + ", userNom=" + super.getUserNom()
				+ ", motDePasse=" + super.getMotDePasse() + ", adresses=" + super.getAdresses() + "]";
	}


}
