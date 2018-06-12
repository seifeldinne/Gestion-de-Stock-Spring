package org.tuto1.com.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tuto1.com.dao.ILigneCodeClientDao;
import org.tuto1.com.entites.LigneCodeClient;
@Repository
public class LigneCodeClientDaoImp  extends GenericDAOImpl<LigneCodeClient> implements ILigneCodeClientDao{


	public ILigneCodeClientDao getDao() {
		return dao;
	}
	public void setDao(ILigneCodeClientDao dao) {
		this.dao = dao;
	}
	ILigneCodeClientDao dao ;
	public LigneCodeClient add(LigneCodeClient entity){
		return dao.add(entity);
	}
	public LigneCodeClient update(LigneCodeClient entity){
		return dao.update(entity);
	}
	public void remove(Long l){
		dao.remove(l);
	}
	public List<LigneCodeClient> selectAll(){
		return dao.selectAll();
	}
	public List<LigneCodeClient> selectAll(String Filed, String sort){
		return dao.selectAll(Filed, sort);
	}
	public LigneCodeClient getById(Long l){
		return dao.getById(l);
	}
	public LigneCodeClient findOneBy(String strname,Object param){
		return dao.findOneBy(strname, param);
	}
	public LigneCodeClient findOneBy(String [] strname,Object[] param){
		return dao.findOneBy(strname, param);
	}
	public List<LigneCodeClient> findAllBy(String [] strname,Object[] param){	
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param){
		return dao.countBy(strname, param);
	}
}
