package org.tuto1.com.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CommandeClient  implements Serializable{
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idcommandeCl ;

	public Long getIdcommandeCl() {
		return idcommandeCl;
	}

	public void setIdcommandeCl(Long idcommandeCl) {
		this.idcommandeCl = idcommandeCl;
	}

	public CommandeClient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
