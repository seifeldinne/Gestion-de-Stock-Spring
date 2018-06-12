package org.tuto1.com.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tuto1.com.dao.IclientDao;
import org.tuto1.com.entites.Client;


@Repository
public class ClientDaoImp implements IclientDao{

	//@Autowired
	@PersistenceContext
	EntityManager em ;

	public ClientDaoImp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public Client addClient(Client c) {
		em.getTransaction().begin();
		em.persist(c);
		em.getTransaction().commit();
		return c;
	}

	@Override
	public Client delete(Client c) {
		Client ct = em.find(Client.class, c.getIdClient());
		if (ct !=null)
			em.remove(c);
	
		return c ;
	}

	@Override
	public List<Client> findAll() {
		Query que =em.createQuery("select o from client o");
		return que.getResultList();
		 
	}

	@Override
	public Client update(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client findCliByid(Long mc) {
		Query que =em.createQuery("select o from client o where nom like :x");
		que.setParameter(":x","%"+mc+"%" );
		return (Client) que.getSingleResult();
	}
	

}
