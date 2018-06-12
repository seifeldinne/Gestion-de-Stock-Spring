package org.tuto1.com.service.imp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.tuto1.com.dao.IArticleDAO;
import org.tuto1.com.entites.Article;
import org.tuto1.com.service.IArticleService;

@Service
@Transactional
public class ArticleServiceImp implements IArticleService {

	private IArticleDAO dao ;
	@Override
	public Article add(Article entity) {
		
		return dao.add(entity);
	}

	public IArticleDAO getDao() {
		return dao;
	}

	public void setDao(IArticleDAO dao) {
		this.dao = dao;
	}

	@Override
	public Article update(Article entity) {
		
		return dao.update(entity);
	}

	@Override
	public void remove(Long l) {
		dao.remove(l);
		
	}

	@Override
	public List<Article> selectAll() {
		
		return dao.selectAll();
	}

	@Override
	public List<Article> selectAll(String Filed, String sort) {
		
		return dao.selectAll(Filed, sort);
	}

	@Override
	public Article getById(Long l) {
		
		return dao.getById(l);
	}

	@Override
	public Article findOneBy(String strname, Object param) {
		
		return dao.findOneBy(strname, param);
	}

	@Override
	public Article findOneBy(String[] strname, Object[] param) {
		
		return dao.findOneBy(strname, param);
	}

	@Override
	public List<Article> findAllBy(String[] strname, Object[] param) {
		
		return dao.findAllBy(strname, param);
	}

	@Override
	public int countBy(String strname, Object param) {
		
		return dao.countBy(strname, param);
	}
	

}
