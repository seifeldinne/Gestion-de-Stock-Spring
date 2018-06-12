package org.tuto1.com.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tuto1.com.dao.ILigneCdeFournisseurDao;
import org.tuto1.com.entites.LigneCdeFournisseur;
@Repository
public class LigneCdeFournisseurDaoImp extends GenericDAOImpl<LigneCdeFournisseur> implements ILigneCdeFournisseurDao{
	

	private ILigneCdeFournisseurDao dao ;

	public ILigneCdeFournisseurDao getDao() {
		return dao;
	}

	public void setDao(ILigneCdeFournisseurDao dao) {
		this.dao = dao;
	}
	
	public LigneCdeFournisseur add(LigneCdeFournisseur entity) {
		return dao.add(entity);
	}
	public LigneCdeFournisseur update(LigneCdeFournisseur entity) {
		return dao.update(entity);
	}
	public void remove(Long l) {
		dao.remove(l);
	}
	public List<LigneCdeFournisseur> selectAll() {
		return dao.selectAll();
	}
	public List<LigneCdeFournisseur> selectAll(String Filed, String sort) {
		return dao.selectAll(Filed, sort);
	}
	public LigneCdeFournisseur getById(Long l) {
		return dao.getById(l);
	}
	public LigneCdeFournisseur findOneBy(String strname,Object param) {
		return dao.findOneBy(strname, param);
	}
	public LigneCdeFournisseur findOneBy(String [] strname,Object[] param) {
		return dao.findOneBy(strname, param);
	}
	public List<LigneCdeFournisseur> findAllBy(String [] strname,Object[] param) {
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param) {
		return dao.countBy(strname, param);
	}

}
