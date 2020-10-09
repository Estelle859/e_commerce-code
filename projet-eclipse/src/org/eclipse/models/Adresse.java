package org.eclipse.models;

public class Adresse {
	private int id;
	private String rue;
	private String codepostal;
	private String ville;
	
	public Adresse(int id,String rue, String codepostal, String ville) {	
		this.setId(id);
		this.rue = rue;
		this.codepostal = codepostal;
		this.ville = ville;
	}
	
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", rue=" + rue + ", codepostal=" + codepostal + ", ville=" + ville + "]";
	}
	
	

}
