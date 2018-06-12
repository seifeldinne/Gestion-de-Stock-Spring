package org.tuto1.com.service;

import java.util.List;

import org.tuto1.com.entites.Article;

public interface IArticleService {
	public Article add(Article entity);
	public Article update(Article entity);
	public void remove(Long l);
	public List<Article> selectAll();
	public List<Article> selectAll(String Filed, String sort);
	public Article getById(Long l);
	public Article findOneBy(String strname,Object param);
	public Article findOneBy(String [] strname,Object[] param);
	public List<Article> findAllBy(String [] strname,Object[] param);
	public int countBy(String strname,Object param);

}
