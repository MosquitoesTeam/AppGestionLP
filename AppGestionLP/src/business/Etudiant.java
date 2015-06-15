package business;

import java.io.Serializable;

public class Etudiant implements Serializable {
	
	private String nom;
	private String prenom;
	private String cin;
	private String mail;
	private String diplome;
	private String specialite;
	private Float moyenne;
	private String tel;
	
	
	
	public Etudiant() {
		this.nom = "";
		this.prenom = "";
		this.cin = "";
		this.mail = "";
		this.diplome = "";
		this.specialite = "";
		this.moyenne = new Float(0);
		this.tel = "";
	}
	
	public String toString(){
		return "==>" +nom +", "+ prenom +", "+  cin +", "+  mail +", "+  diplome +", "+  specialite  +", "+  moyenne +", "+  tel;
	}
	public Etudiant(String nom, String prenom, String cin, String mail,
			String diplome, String specialite, Float moyenne, String tel) {
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.mail = mail;
		this.diplome = diplome;
		this.specialite = specialite;
		this.moyenne = moyenne;
		this.tel = tel;
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
