package org.tuto1.com.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.tuto1.com.dao.IRolesDao;
import org.tuto1.com.entites.Roles;

@Repository
public class RolesDaoImp extends GenericDAOImpl<Roles> implements IRolesDao {

	private IRolesDao dao ;
	
	public Roles add(Roles entity) {
		return dao.add(entity);
	}
	public Roles update(Roles entity) {
		return dao.update(entity);
	}
	public void remove(Long l) {
		dao.remove(l);
	}
	public List<Roles> selectAll() {
		return dao.selectAll();
	}
	public List<Roles> selectAll(String Filed, String sort) {
		return dao.selectAll(Filed, sort);
	}
	public Roles getById(Long l) {
		return dao.getById(l);
	}
	public Roles findOneBy(String strname,Object param) {
		return dao.findOneBy(strname, param);
	}
	public Roles findOneBy(String [] strname,Object[] param) {
		return dao.findOneBy(strname, param);
	}
	public List<Roles> findAllBy(String [] strname,Object[] param) {
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param) {
		return dao.countBy(strname, param);
	}
	public IRolesDao getDao() {
		return dao;
	}
	public void setDao(IRolesDao dao) {
		this.dao = dao;
	}
	
}
