package org.tuto1.com.service.imp;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tuto1.com.dao.IMvtStkDao;
import org.tuto1.com.entites.MvtStk;
import org.tuto1.com.service.IMvtStkService;
@Service
@Transactional
public class MvtStkServiceImp  implements IMvtStkService{
	
	
	private IMvtStkDao dao ;
	public MvtStk add(MvtStk entity){
		return dao.add(entity);
	}
	public MvtStk update(MvtStk entity){
		return dao.update(entity);
	}
	public void remove(Long l){
		dao.remove(l);
	}
	public List<MvtStk> selectAll(){
		return dao.selectAll();
	}
	public List<MvtStk> selectAll(String Filed, String sort){
		return dao.selectAll(Filed, sort);
	}
	public MvtStk getById(Long l){
		return dao.getById(l);
	}
	public MvtStk findOneBy(String strname,Object param){
		return dao.findOneBy(strname, param);
	}
	public MvtStk findOneBy(String [] strname,Object[] param){
		return dao.findOneBy(strname, param);
	}
	public List<MvtStk> findAllBy(String [] strname,Object[] param){
		
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param){
		return dao.countBy(strname, param);
	}
}
