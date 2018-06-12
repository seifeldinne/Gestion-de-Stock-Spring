package org.tuto1.com.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LigneCodeClient implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLongCodCli ;

	public LigneCodeClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdLongCodCli() {
		return idLongCodCli;
	}

	public void setIdLongCodCli(Long idLongCodCli) {
		this.idLongCodCli = idLongCodCli;
	}
	
	
}
