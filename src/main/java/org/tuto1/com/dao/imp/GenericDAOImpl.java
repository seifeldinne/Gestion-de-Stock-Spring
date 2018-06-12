package org.tuto1.com.dao.imp;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.tuto1.com.dao.IGenericDao;
@SuppressWarnings("unchecked")
public class GenericDAOImpl<E> implements IGenericDao<E> {
	
	@PersistenceContext
	 EntityManager em ;
	private Class<E> type ;
	
	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	public Class<E> getType() {
		return type;
	}

	
	public GenericDAOImpl() {
		Type tp=getClass().getGenericSuperclass();
		ParameterizedType t = (ParameterizedType) tp ;
		type=(Class<E>) t.getActualTypeArguments()[0];
	}

	@Override
	public E add(E e) {
		em.persist(e);
		return e;
	}

	@Override
	public E update(E e) {
		// TODO Auto-generated method stub
		em.merge(e);
		return e;
	}

	@Override
	
	public void remove(Long l) {
		E e = em.getReference(type, l);
		em.remove(e);
		
	}

	@Override
	public List<E> selectAll() {
		// TODO Auto-generated method stub
		Query re = em.createQuery("select t from "+type.getSimpleName()+" t");
		return re.getResultList();
		
	}

	@Override
	public List<E> selectAll(String Filed, String sort) {
		Query re = em.createQuery("select t from "+type.getSimpleName()+" t order by "+Filed+" "+sort);
		return re.getResultList();
		
	}

	@Override
	public E getById(Long l) {
		return em.find(type, l);
	}

	@Override
	public E findOneBy(String strname, Object param) {
		Query re = em.createQuery("select t from "+type.getSimpleName()+" t where  "+strname+" = :x");
		re.setParameter(strname, param);
		return  re.getResultList().size() > 0 ?  (E) re.getResultList().get(0) : null  ;
	}

	@Override
	public E findOneBy(String[] strname, Object[] param) {
		if (strname.length != param.length)
			return null ;
		 String req="select t from "+type.getSimpleName()+" t where  ";
		int l =strname.length;
		for(int i=0 ;i<l ;i++){
			req +="e."+strname[i]+" = :x"+i;
			if((i+1)<l)
				req+="and";
			}
		Query que =em.createQuery(req);
		for(int j = 0 ; j < param.length ; j++){
			que.setParameter("x"+j, param[j]);
			}
		return que.getResultList().size()>0 ? (E)que.getResultList().get(0):null; 
		
	}

	@Override
	public List<E> findAllBy(String[] strname, Object[] param) {
		Query re = em.createQuery("");
		return re.getResultList();
		
	}

	@Override
	public int countBy(String strname, Object param) {
		return 0;
	}

}
