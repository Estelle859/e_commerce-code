package org.eclipse.services;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.models.LignePanier;

public class LignePanierService {
	
List<LignePanier> lnpaniers = new ArrayList<>();
	
	public void saveLignePanier(LignePanier lnpanier) {	
		lnpaniers.add(lnpanier);
		
	}	
	public void removeLignePanier(LignePanier lnpanier) {
		lnpaniers.remove(lnpanier);
	}
	public void updateLignePanier(LignePanier lnpanier) {		
		for(LignePanier lpan : lnpaniers) {		
			if(lpan.getId()==lnpanier.getId()) {
				System.out.println("UPDATING..." );			
				lpan.setPanier(lnpanier.getPanier());	
				lpan.setProduit(lnpanier.getProduit());
				lpan.setQuantiteProduit(lnpanier.getQuantiteProduit());
				
			}
		}
		
	}
	public LignePanier findByIdLignePanier(int lnpanierId) {
		for(LignePanier lpan : lnpaniers) {
			if(lnpanierId == lpan.getId()) return lpan;
		}	
		return null;
	}
	public List<LignePanier> getLignePaniers() {
		return lnpaniers;
	}
	public void setLignePaniers(List<LignePanier> lnpaniers) {
		this.lnpaniers = lnpaniers;
	}	

	
}
