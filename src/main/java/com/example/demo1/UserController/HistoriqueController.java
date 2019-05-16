package com.example.demo1.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.Service.ArticleService;
import com.example.demo1.Service.BondecmndeService;
import com.example.demo1.Service.HistoriqueService;
import com.example.demo1.model.*;

@Controller

public class HistoriqueController {
	
	
@Autowired
HistoriqueService historiqueService;

@Autowired
ArticleService articleService;

@Autowired
BondecmndeService bondecmndeService;

@RequestMapping(value="/article/list", method=RequestMethod.GET)
public ModelAndView list() {
 ModelAndView model = new ModelAndView("Article/article_list");
 List<Bondecmnde> articleList = bondecmndeService.getAllBondecmndes();
 model.addObject("articleList", articleList);
 return model;
}

	

@GetMapping("save")
@ResponseBody
public String save (@RequestParam("article")String article,@RequestParam("quantite")int quantite)
{
	
	Bondecmnde bndcmd = new Bondecmnde();
	User user = new User();
	
	try
	{
		//System.out.println(quantite);
		
		Historique historique = new Historique();
			historique.setArticle(article);
			historique.setQuantite(quantite);
			historique.setUser(user.getName());
			historiqueService.saveOrUpdate(historique);
			
		return "true";
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
		return"false";
	}
}


@RequestMapping(value="/article/stock", method=RequestMethod.GET)
public ModelAndView Stock() {
 ModelAndView model = new ModelAndView("Article/stock");
 List<Historique> historiqueList = historiqueService.getAllHistoriques();
 model.addObject("historiqueList",historiqueList);
 return model;
}



/*
@RequestMapping(value="/Historique/{id}", method=RequestMethod.GET)
public ModelAndView historique(@PathVariable("id") long id) {

             if


}
*/
}
