package org.tuto1.com.dao;

import java.util.List;

import org.tuto1.com.entites.Categorie;

public interface ICategorieDao  extends IGenericDao<Categorie>{

	public Categorie add(Categorie entity);
	public Categorie update(Categorie entity);
	public void remove(Long l);
	public List<Categorie> selectAll();
	public List<Categorie> selectAll(String Filed, String sort);
	public Categorie getById(Long l);
	public Categorie findOneBy(String strname,Object param);
	public Categorie findOneBy(String [] strname,Object[] param);
	public List<Categorie> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);
 

 }

