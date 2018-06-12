package org.tuto1.com.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code;
	private int code_utilisateur ;
	private String nom ;
	private String prenom ;
	private String mpt ;
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(int code_utilisateur, String nom, String prenom,
			String mpt) {
		super();
		this.code_utilisateur = code_utilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.mpt = mpt;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public int getCode_utilisateur() {
		return code_utilisateur;
	}
	public void setCode_utilisateur(int code_utilisateur) {
		this.code_utilisateur = code_utilisateur;
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
	public String getMpt() {
		return mpt;
	}
	public void setMpt(String mpt) {
		this.mpt = mpt;
	}
	
}
