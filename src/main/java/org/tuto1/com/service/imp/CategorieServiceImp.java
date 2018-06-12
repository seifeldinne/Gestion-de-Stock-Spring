package org.tuto1.com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tuto1.com.dao.ICategorieDao;
import org.tuto1.com.entites.Categorie;
import org.tuto1.com.service.ICategorieService;
@Service
@Transactional
public class CategorieServiceImp  implements ICategorieService {
	
	private ICategorieDao dao ;
	
	public ICategorieDao getDao() {
		return dao;
	}
	public void setDao(ICategorieDao dao) {
		this.dao = dao;
	}
	public Categorie add(Categorie entity){
		return dao.add(entity);
	}
	public Categorie update(Categorie entity){
		return dao.update(entity);
	}
	public void remove(Long l){
		dao.remove(l);
	}
	public List<Categorie> selectAll(){
		return dao.selectAll();
	}
	public List<Categorie> selectAll(String Filed, String sort){
		return dao.selectAll(Filed, sort);
	}
	public Categorie getById(Long l){
		return dao.getById(l);
	}
	public Categorie findOneBy(String strname,Object param){
		return dao.findOneBy(strname, param);
	}
	public Categorie findOneBy(String [] strname,Object[] param){
		return dao.findOneBy(strname, param);
	}
	public List<Categorie> findAllBy(String [] strname,Object[] param){
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param){
		return dao.countBy(strname, param);
	}

}
