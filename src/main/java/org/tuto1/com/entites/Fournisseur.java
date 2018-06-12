package org.tuto1.com.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fournisseur implements Serializable{
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idForunisseur ;

	public Long getIdForunisseur() {
		return idForunisseur;
	}

	public void setIdForunisseur(Long idForunisseur) {
		this.idForunisseur = idForunisseur;
	}

	public Fournisseur() {
		super();
	}
	
	
	
}
