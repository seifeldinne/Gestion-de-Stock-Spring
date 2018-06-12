package org.tuto1.com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tuto1.com.dao.ILigneCdeFournisseurDao;
import org.tuto1.com.entites.LigneCdeFournisseur;
import org.tuto1.com.service.ILigneCdeFournisseurService;
@Service
@Transactional
public class LigneCdeFournisseurServiceImp  implements ILigneCdeFournisseurService{
	
	
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
