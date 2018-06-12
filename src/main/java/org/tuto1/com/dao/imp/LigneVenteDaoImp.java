package org.tuto1.com.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tuto1.com.dao.ILigneVenteDao;
import org.tuto1.com.entites.LigneVente;
@Repository
public class LigneVenteDaoImp  extends GenericDAOImpl<LigneVente> implements ILigneVenteDao{
	


	private ILigneVenteDao dao;
    public ILigneVenteDao getDao() {
		return dao;
	}
	public void setDao(ILigneVenteDao dao) {
		this.dao = dao;
	}
	public LigneVente add(LigneVente entity){
    	return dao.add(entity);
    }
	public LigneVente update(LigneVente entity){
	    return dao.update(entity);
	}
	public void remove(Long l){
		dao.remove(l);
	}
	public List<LigneVente> selectAll(){
		return dao.selectAll();
	}
	public List<LigneVente> selectAll(String Filed, String sort){
		return dao.selectAll(Filed, sort);
	}
	public LigneVente getById(Long l){
		return dao.getById(l);
	}
	public LigneVente findOneBy(String strname,Object param){
		return dao.findOneBy(strname, param);
	}
	public LigneVente findOneBy(String [] strname,Object[] param){
		return dao.findOneBy(strname, param);
	}
	public List<LigneVente> findAllBy(String [] strname,Object[] param){
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param){
		return dao.countBy(strname, param);
	}
}
