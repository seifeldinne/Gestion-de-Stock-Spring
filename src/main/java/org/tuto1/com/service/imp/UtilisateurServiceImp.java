package org.tuto1.com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tuto1.com.dao.IUtilisateurDAO;
import org.tuto1.com.entites.Utilisateur;
import org.tuto1.com.service.IUtilisateurService;
@Service
@Transactional

public class UtilisateurServiceImp  implements IUtilisateurService {
	
	
	private IUtilisateurDAO dao ;

	public IUtilisateurDAO getDao() {
		return dao;
	}

	public void setDao(IUtilisateurDAO dao) {
		this.dao = dao;
	}
	
	public Utilisateur add(Utilisateur entity){
	
		return dao.add(entity);
		
	}
	
	public Utilisateur update(Utilisateur entity){
		return dao.update(entity);
	}
	
	public void remove(Long l){
		dao.remove(l);
	}
	public List<Utilisateur> selectAll(){
		return dao.selectAll();
	}
	public List<Utilisateur> selectAll(String Filed, String sort){
		
		return dao.selectAll(Filed, sort);
		
	}
	public Utilisateur getById(Long l){
		
		return dao.getById(l);
	}
	public Utilisateur findOneBy(String strname,Object param){	
		return dao.findOneBy(strname, param); 
	}
	public Utilisateur findOneBy(String [] strname,Object[] param){
		
		return dao.findOneBy(strname, param);
		
	}
	public List<Utilisateur> findAllBy(String [] strname,Object[] param){
		
		return dao.findAllBy(strname, param);
		
	}
	public int countBy(String strname,Object param){
		
		return dao.countBy(strname, param);
	}

	
	
	
}
