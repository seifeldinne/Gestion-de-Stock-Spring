package org.tuto1.com.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommandeFournisseur implements Serializable{

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idCommFourn;

	public Long getIdCommFourn() {
		return idCommFourn;
	}

	public void setIdCommFourn(Long idCommFourn) {
		this.idCommFourn = idCommFourn;
	}

	public CommandeFournisseur() {
		super();
	}
	
}
