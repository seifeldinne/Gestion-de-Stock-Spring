package org.tuto1.com.dao.imp;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.tuto1.com.dao.ICommandeClientDAO;
import org.tuto1.com.entites.CommandeClient;
@Repository
public class CommadeClientDAOImp  extends GenericDAOImpl<CommandeClient> implements ICommandeClientDAO{
	
	ICommandeClientDAO dao;
	
	public ICommandeClientDAO getDao() {
		return dao;
	}
	public void setDao(ICommandeClientDAO dao) {
		this.dao = dao;
	}
	public CommadeClientDAOImp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CommandeClient add(CommandeClient entity){
		
		return dao.add(entity);
	}
	public CommandeClient update(CommandeClient entity){
		return dao.update(entity);
	}
	public void remove(Long l){
		dao.remove(l);
	}
	public List<CommandeClient> selectAll(){
		
		return dao.selectAll();
	}
	public List<CommandeClient> selectAll(String Filed, String sort){
		
		return dao.selectAll(Filed, sort);
		
	}
	public CommandeClient getById(Long l){
		
		return dao.getById(l);
	}
	public CommandeClient findOneBy(String strname,Object param){
		
		return dao.findOneBy(strname, param);
				
	}
	public CommandeClient findOneBy(String [] strname,Object[] param){
		return dao.findOneBy(strname, param);
	}
	public List<CommandeClient> findAllBy(String [] strname,Object[] param){
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param){
		
		return dao.countBy(strname, param);
	}

}
