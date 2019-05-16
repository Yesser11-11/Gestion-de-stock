package com.example.demo1.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo1.model.Article;

public interface ArticleRepository extends CrudRepository<Article, Integer> {

	void deleteById(long id);
	
	public List<Article> findByCategory(String s);

	

}
