package business;

import java.io.Serializable;

public class Etudiant implements Serializable {
	
	private String cin;
	private String cne;
	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}
	private String nom;
	private String prenom;
	private String mail;
	private String tel;
	private String diplome;
	private String specialite;
	private Float moyenne;
	
	
	
	
	public Etudiant() {
		this.cin = "";
		this.cne = "";
		this.nom = "";
		this.prenom = "";
		this.tel = "";
		this.mail = "";
		this.diplome = "";
		this.specialite = "";
		this.moyenne = new Float(0);
	}
	
	public String toString(){
		return "==>" +nom +", "+ prenom +", "+  cin +", "+  mail +", "+  diplome +", "+  specialite  +", "+  moyenne +", "+  tel;
	}
	public Etudiant(String cin, String cne, String nom, String prenom, String mail, String tel,
			String diplome, String specialite, Float moyenne) {
		
		this.cin = cin;
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.mail = mail;
		this.diplome = diplome;
		this.specialite = specialite;
		this.moyenne = moyenne;
		
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
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public String getSpecialite() {
		return specialite;
	}
	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}
	public Float getMoyenne() {
		return moyenne;
	}
	public void setMoyenne(Float moyenne) {
		this.moyenne = moyenne;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
