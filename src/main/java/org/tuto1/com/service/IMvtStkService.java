package org.tuto1.com.service;

import java.util.List;

import org.tuto1.com.entites.MvtStk;

public interface IMvtStkService  {
	public MvtStk add(MvtStk entity);
	public MvtStk update(MvtStk entity);
	public void remove(Long l);
	public List<MvtStk> selectAll();
	public List<MvtStk> selectAll(String Filed, String sort);
	public MvtStk getById(Long l);
	public MvtStk findOneBy(String strname,Object param);
	public MvtStk findOneBy(String [] strname,Object[] param);
	public List<MvtStk> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);
}
