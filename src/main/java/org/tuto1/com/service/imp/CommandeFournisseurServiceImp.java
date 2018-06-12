package org.tuto1.com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tuto1.com.dao.ICommandeClientDAO;
import org.tuto1.com.dao.ICommandeFournisseurDAO;
import org.tuto1.com.entites.CommandeFournisseur;
import org.tuto1.com.service.ICommandeFournisseurService;
@Service
@Transactional
public class CommandeFournisseurServiceImp   implements ICommandeFournisseurService{

	
	private ICommandeFournisseurDAO dao ;
	public ICommandeFournisseurDAO getDao() {
		return dao;
	}
	public void setDao(ICommandeFournisseurDAO dao) {
		this.dao = dao;
	}
	public CommandeFournisseur add(CommandeFournisseur entity){
		return dao.add(entity);
	}
	public CommandeFournisseur update(CommandeFournisseur entity){
		return dao.update(entity);
	}
	public void remove(Long l){
		dao.remove(l);
	}
	public List<CommandeFournisseur> selectAll(){
		return dao.selectAll();
	}
	public List<CommandeFournisseur> selectAll(String Filed, String sort){
		return dao.selectAll(Filed, sort);
	}
	public CommandeFournisseur getById(Long l){
		return dao.getById(l);
	}
	public CommandeFournisseur findOneBy(String strname,Object param){
		return dao.findOneBy(strname, param);
	}
	public CommandeFournisseur findOneBy(String [] strname,Object[] param){
		return dao.findOneBy(strname, param);
	}
	public List<CommandeFournisseur> findAllBy(String [] strname,Object[] param){		
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param){
		return dao.countBy(strname, param);
	}
}