package com.example.demo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo1.Repository.ArticleRepository;
import com.example.demo1.model.Article;


@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
 
 @Autowired
 ArticleRepository articleRepository;

 @Override
 public List<Article> getAllArticles() {
  return (List<Article>) articleRepository.findAll();
 }

 @Override
 public Article getArticleById(long id) {
  return articleRepository.findById((int) id).get();
 }

 @Override
 public void saveOrUpdate(Article article) {
  articleRepository.save(article);
 }

 @Override
 public void deleteArticle(long id) {
  articleRepository.deleteById(id);
 }



}