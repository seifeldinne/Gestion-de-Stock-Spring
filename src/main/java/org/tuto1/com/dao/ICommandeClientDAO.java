package org.tuto1.com.dao;

import java.util.List;

import org.tuto1.com.entites.Article;
import org.tuto1.com.entites.CommandeClient;

public interface ICommandeClientDAO extends IGenericDao<CommandeClient> {
	
	public CommandeClient add(CommandeClient entity);

	public CommandeClient update(CommandeClient entity);
	
	public void remove(Long l);
	
	public List<CommandeClient> selectAll();
	
	public List<CommandeClient> selectAll(String Filed, String sort);
	
	public CommandeClient getById(Long l);
	
	public CommandeClient findOneBy(String strname,Object param);
	
	public CommandeClient findOneBy(String [] strname,Object[] param);
	
	public List<CommandeClient> findAllBy(String [] strname,Object[] param);
	
	public int countBy(String strname,Object param);

}
