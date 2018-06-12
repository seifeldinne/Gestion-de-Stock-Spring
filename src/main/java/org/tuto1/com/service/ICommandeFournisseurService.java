package org.tuto1.com.service;

import java.util.List;

import org.tuto1.com.entites.CommandeFournisseur;

public interface ICommandeFournisseurService  {

	public CommandeFournisseur add(CommandeFournisseur entity);
	public CommandeFournisseur update(CommandeFournisseur entity);
	public void remove(Long l);
	public List<CommandeFournisseur> selectAll();
	public List<CommandeFournisseur> selectAll(String Filed, String sort);
	public CommandeFournisseur getById(Long l);
	public CommandeFournisseur findOneBy(String strname,Object param);
	public CommandeFournisseur findOneBy(String [] strname,Object[] param);
	public List<CommandeFournisseur> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);
}
