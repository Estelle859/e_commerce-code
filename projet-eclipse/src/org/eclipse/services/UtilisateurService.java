package org.eclipse.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.models.Adresse;
import org.eclipse.models.Utilisateur;

public class UtilisateurService {
	
	List<Utilisateur> users = new ArrayList<>();
	
	public UtilisateurService() {
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
		users.addAll(Arrays.asList(user1,user2));
	}
	public void saveUser(Utilisateur user) {			
		users.add(user);
		
	}	
	public void removeUser(Utilisateur user) {
		users.remove(user);
	}
	public void updateUser(Utilisateur user) {		
		for(Utilisateur us : users) {		
			if(user.getId() == us.getId()) {
				System.out.println("UPDATING..." );
				us.setNom(user.getNom());	
				us.setPrenom(user.getPrenom());
				us.setUserNom(user.getUserNom());
				us.setMotDePasse(us.getMotDePasse());
				us.setAdresses(us.getAdresses());
			}
		}		
	}
	public List<Utilisateur> getAllUsers() {
        return users;
    }
	public Utilisateur findByIdUser(int userId) {
		for(Utilisateur us : users) {
			if(userId == us.getId()) return us;
		}		
		return null;
	}	
	
	public Utilisateur findByLoginAndPassword(String login,String password) {
		for(Utilisateur us : users) {
			if((us.getUserNom() == login) && (us.getMotDePasse()==password)) return us;
		}		
		return null;
	}	

}
