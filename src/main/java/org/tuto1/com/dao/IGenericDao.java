package org.tuto1.com.dao;

import java.util.List;

import javax.persistence.Entity;

public interface IGenericDao<E> {
	
	public E add(E entity);
	public E update(E entity);
	public void remove(Long l);
	public List<E> selectAll();
	public List<E> selectAll(String Filed, String sort);
	public E getById(Long l);
	public E findOneBy(String strname,Object param);
	public E findOneBy(String [] strname,Object[] param);
	public List<E> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);
}
