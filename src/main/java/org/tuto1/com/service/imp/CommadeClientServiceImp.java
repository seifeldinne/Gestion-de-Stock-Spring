package org.tuto1.com.service.imp;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tuto1.com.dao.ICommandeClientDAO;
import org.tuto1.com.entites.CommandeClient;
import org.tuto1.com.service.ICommandeClientService;
@Service
@Transactional
public class CommadeClientServiceImp  implements ICommandeClientService{
	
	ICommandeClientDAO dao;
	
	public ICommandeClientDAO getDao() {
		return dao;
	}
	public void setDao(ICommandeClientDAO dao) {
		this.dao = dao;
	}
	public CommadeClientServiceImp() {
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
