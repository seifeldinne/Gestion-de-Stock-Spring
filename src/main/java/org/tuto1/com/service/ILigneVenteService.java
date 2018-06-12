package org.tuto1.com.service;

import java.util.List;

import org.tuto1.com.entites.LigneVente;

public interface ILigneVenteService{
	public LigneVente add(LigneVente entity);
	public LigneVente update(LigneVente entity);
	public void remove(Long l);
	public List<LigneVente> selectAll();
	public List<LigneVente> selectAll(String Filed, String sort);
	public LigneVente getById(Long l);
	public LigneVente findOneBy(String strname,Object param);
	public LigneVente findOneBy(String [] strname,Object[] param);
	public List<LigneVente> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);
}
