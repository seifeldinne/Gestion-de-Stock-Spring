package org.tuto1.com.dao;

import java.util.List;

import org.tuto1.com.entites.Fournisseur;

public interface IFournisseurDao extends IGenericDao<Fournisseur>{

	public Fournisseur add(Fournisseur entity);
	public Fournisseur update(Fournisseur entity);
	public void remove(Long l);
	public List<Fournisseur> selectAll();
	public List<Fournisseur> selectAll(String Filed, String sort);
	public Fournisseur getById(Long l);
	public Fournisseur findOneBy(String strname,Object param);
	public Fournisseur findOneBy(String [] strname,Object[] param);
	public List<Fournisseur> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);
}
