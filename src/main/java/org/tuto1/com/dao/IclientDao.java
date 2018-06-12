package org.tuto1.com.dao;

import java.util.List;

import org.tuto1.com.entites.Client;

public interface IclientDao {
	
	public Client addClient(Client c);
	public Client delete(Client c);
	public List<Client> findAll();
	public Client update(Client c);
	public Client findCliByid(Long mc);

}
