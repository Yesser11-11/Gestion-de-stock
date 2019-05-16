/*package com.example.demo1.UserController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.Repository.ArticleRepository;
import com.example.demo1.Service.ArticleService;
import com.example.demo1.Service.ArticleServiceImpl;
import com.example.demo1.Service.BondecmndeService;
import com.example.demo1.Service.HistoriqueService;
import com.example.demo1.model.Article;
import com.example.demo1.model.Bondecmnde;
import com.example.demo1.model.Historique;

@Controller
public class ArticleController {

 @Autowired
 ArticleService articleService;
 @Autowired
 BondecmndeService bondecmndeService;
 
 
 
 
 //Article LIST
 @RequestMapping(value="/article/list", method=RequestMethod.GET)
 public ModelAndView list() {
  ModelAndView model = new ModelAndView("Article/article_list");
  List<Bondecmnde> articleList = bondecmndeService.getAllBondecmndes();
  model.addObject("articleList", articleList);
  return model;
 }
 
 
}
*/