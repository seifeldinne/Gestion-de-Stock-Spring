package org.tuto1.com.dao.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tuto1.com.dao.IArticleDAO;
import org.tuto1.com.entites.Article;

@Transactional
@Service
@Repository
public class ArticleDAOImp extends GenericDAOImpl<Article> implements IArticleDAO {
	
	 IArticleDAO dao ;
	public IArticleDAO getDao() {
		return dao;
	}
	public void setDao(IArticleDAO dao) {
		this.dao = dao;
	}
	public Article add(Article entity){
		return dao.add(entity);
	}
	public Article update(Article entity){
		return dao.update(entity);
	}
	public void remove(Long l){
		dao.remove(l);;
		
	}
	public List<Article> selectAll(){
		return dao.selectAll();
		
	}
	public List<Article> selectAll(String Filed, String sort){
		return dao.selectAll(Filed, sort);
	}
	public Article getById(Long l){
		return dao.getById(l);
	}
	public Article findOneBy(String strname,Object param){
		
		return dao.findOneBy(strname, param);
	}
	public Article findOneBy(String [] strname,Object[] param){
		return dao.findOneBy(strname, param);
		
	}
	public List<Article> findAllBy(String [] strname,Object[] param){
		
		return dao.findAllBy(strname, param);
	}
	public int countBy(String strname,Object param){
		return dao.countBy(strname, param);
	}
	
}
