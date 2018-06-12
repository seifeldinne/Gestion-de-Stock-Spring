package org.tuto1.com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tuto1.com.dao.IFournisseurDao;
import org.tuto1.com.entites.Fournisseur;
import org.tuto1.com.service.IFournisseurService;
@Service
@Transactional
public class FournisseurServiceImp   implements IFournisseurService{
	

	private IFournisseurDao dao;
	
	public IFournisseurDao getDao() {
		return dao;
	}
	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}
	public Fournisseur add(Fournisseur entity) {
		return dao.add(entity);
	}
	public Fournisseur update(Fournisseur entity) {
		return dao.update(entity);
	}
	public void remove(Long l) {
		dao.remove(l);
	}
	public List<Fournisseur> selectAll() {
		return dao.selectAll();
	}
	public List<Fournisseur> selectAll(String Filed, String sort) {
		return dao.selectAll(Filed, sort);
	}
	public Fournisseur getById(Long l) {
		return dao.getById(l);
	}
	public Fournisseur findOneBy(String strname,Object param) {
		return dao.findOneBy(strname, param);
	}
	public Fournisseur findOneBy(String [] strname,Object[] param) {
		return dao.findOneBy(strname, param);
	}
	public List<Fournisseur> findAllBy(String [] strname,Object[] param) {
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param) {
		return dao.countBy(strname, param);
	}	
}