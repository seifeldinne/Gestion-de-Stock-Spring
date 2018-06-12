package org.tuto1.com.dao;

import java.util.List;

import org.tuto1.com.entites.Utilisateur;

public interface IUtilisateurDAO extends IGenericDao<Utilisateur> {
	
	public Utilisateur add(Utilisateur entity);
	public Utilisateur update(Utilisateur entity);
	public void remove(Long l);
	public List<Utilisateur> selectAll();
	public List<Utilisateur> selectAll(String Filed, String sort);
	public Utilisateur getById(Long l);
	public Utilisateur findOneBy(String strname,Object param);
	public Utilisateur findOneBy(String [] strname,Object[] param);
	public List<Utilisateur> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);

}
