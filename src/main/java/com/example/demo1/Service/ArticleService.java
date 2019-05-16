package com.example.demo1.Service;

import java.util.List;

import com.example.demo1.model.*;

public interface ArticleService {

 public List<Article> getAllArticles();
 
 public Article getArticleById(long id);
 
 public void saveOrUpdate(Article article);
 
 public void deleteArticle(long id);
}