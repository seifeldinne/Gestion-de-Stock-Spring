package org.tuto1.com.service;

import java.util.List;

import org.tuto1.com.entites.Roles;

public interface IRolesService  {
	public Roles add(Roles entity);
	public Roles update(Roles entity);
	public void remove(Long l);
	public List<Roles> selectAll();
	public List<Roles> selectAll(String Filed, String sort);
	public Roles getById(Long l);
	public Roles findOneBy(String strname,Object param);
	public Roles findOneBy(String [] strname,Object[] param);
	public List<Roles> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);

}
