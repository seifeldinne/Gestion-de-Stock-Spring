package org.tuto1.com.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LigneCdeFournisseur implements Serializable {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idLigneCdFourn ;

	public Long getIdLigneCdFourn() {
		return idLigneCdFourn;
	}

	public void setIdLigneCdFourn(Long idLigneCdFourn) {
		this.idLigneCdFourn = idLigneCdFourn;
	}

	public LigneCdeFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
