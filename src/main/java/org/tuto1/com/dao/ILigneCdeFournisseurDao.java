package org.tuto1.com.dao;

import java.util.List;

import org.tuto1.com.entites.LigneCdeFournisseur;

public interface ILigneCdeFournisseurDao {
	
	public LigneCdeFournisseur add(LigneCdeFournisseur entity);
	public LigneCdeFournisseur update(LigneCdeFournisseur entity);
	public void remove(Long l);
	public List<LigneCdeFournisseur> selectAll();
	public List<LigneCdeFournisseur> selectAll(String Filed, String sort);
	public LigneCdeFournisseur getById(Long l);
	public LigneCdeFournisseur findOneBy(String strname,Object param);
	public LigneCdeFournisseur findOneBy(String [] strname,Object[] param);
	public List<LigneCdeFournisseur> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);

}
