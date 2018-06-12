package org.tuto1.com.service;

import java.util.List;

import org.tuto1.com.entites.LigneCodeClient;

public interface ILigneCodeClientService  {
	
	
	public LigneCodeClient add(LigneCodeClient entity);
	public LigneCodeClient update(LigneCodeClient entity);
	public void remove(Long l);
	public List<LigneCodeClient> selectAll();
	public List<LigneCodeClient> selectAll(String Filed, String sort);
	public LigneCodeClient getById(Long l);
	public LigneCodeClient findOneBy(String strname,Object param);
	public LigneCodeClient findOneBy(String [] strname,Object[] param);
	public List<LigneCodeClient> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);


}
