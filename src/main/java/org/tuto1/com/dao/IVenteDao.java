package org.tuto1.com.dao;

import java.util.List;

import org.tuto1.com.entites.Vente;

public interface IVenteDao extends IGenericDao<Vente>{
	public Vente add(Vente entity);
	public Vente update(Vente entity);
	public void remove(Long l);
	public List<Vente> selectAll();
	public List<Vente> selectAll(String Filed, String sort);
	public Vente getById(Long l);
	public Vente findOneBy(String strname,Object param);
	public Vente findOneBy(String [] strname,Object[] param);
	public List<Vente> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);
}
