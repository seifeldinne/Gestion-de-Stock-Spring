package org.tuto1.com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tuto1.com.dao.IVenteDao;
import org.tuto1.com.entites.Vente;
import org.tuto1.com.service.IVenteService;
@Repository
public class VenteServiceImp implements IVenteService{

	private IVenteDao dao ;
	
	public IVenteDao getDao() {
		return dao;
	}
	public void setDao(IVenteDao dao) {
		this.dao = dao;
	}
	public Vente add(Vente entity) {
		return dao.add(entity);
	}
	public Vente update(Vente entity) {
		return dao.update(entity);
	}
	public void remove(Long l) {
		dao.remove(l);
	}
	public List<Vente> selectAll() {
		return dao.selectAll();
	}
	public List<Vente> selectAll(String Filed, String sort) {
		return dao.selectAll(Filed, sort);
	}
	public Vente getById(Long l) {
		return dao.getById(l);
	}
	public Vente findOneBy(String strname,Object param) {
		return dao.findOneBy(strname, param);
	}
	public Vente findOneBy(String [] strname,Object[] param) {
		return dao.findOneBy(strname, param);
	}
	public List<Vente> findAllBy(String [] strname,Object[] param) {
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param) {
		return dao.countBy(strname, param);
	}
}
