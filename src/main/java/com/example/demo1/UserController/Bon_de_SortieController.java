package com.example.demo1.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.Service.Bon_de_SortieService;
import com.example.demo1.model.Bon_de_Sortie;
import com.example.demo1.model.Bondecmnde;




@Controller
public class Bon_de_SortieController {
	
	@Autowired
	 private Bon_de_SortieService bon_de_SortieService;
	
	 //Article LIST
	 @RequestMapping(value="/Bon_de_Sortie/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("CommandeClient/Bon_de_SortieList");
	  List<Bon_de_Sortie> bon_de_SortieList = bon_de_SortieService.FindAllBon_de_Sorties();
	  model.addObject("bon_de_SortieList", bon_de_SortieList);
	  return model;
	 }
	 
	 //Article FORM
	 @RequestMapping(value="/addbon_de_Sortie/", method=RequestMethod.GET)

	 public ModelAndView addArticle() {
	  ModelAndView model = new ModelAndView();
	  
	  Bon_de_Sortie bon_de_Sortie = new Bon_de_Sortie();
	  model.addObject("bondesortieForm", bon_de_Sortie);
	  model.setViewName("CommandeClient/Bondesortie");
	  
	  
	  return model;
	 }
	 @RequestMapping(value="/saveBondesortie", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("bondesortieForm") Bon_de_Sortie bon_de_Sortie) {
		 bon_de_SortieService.saveOrUpdate(bon_de_Sortie);
	  
	  return new ModelAndView("redirect:/Bon_de_Sortie/list");
	 }
	 
	 
	 @RequestMapping(value="/deletebondesortie/{idBon_de_Sortie}", method=RequestMethod.POST)
	 public ModelAndView delete(@PathVariable("idBon_de_Sortie") long idBon_de_Sortie) {
		 bon_de_SortieService.deleteBon_de_Sortie(idBon_de_Sortie);
	  
	  return new ModelAndView("redirect:/Bon_de_Sortie/list");
	 }

	 
	 
	 
	 @RequestMapping(value="/updatebondesortie/{idBon_de_Sortie}", method=RequestMethod.GET)
	 public ModelAndView editArticle(@PathVariable long idBon_de_Sortie) {
	  ModelAndView model = new ModelAndView();
	  
	  Bon_de_Sortie bon_de_Sortie= bon_de_SortieService.getBon_de_SortieById(idBon_de_Sortie);
	  model.addObject("bondesortieForm", bon_de_Sortie);
	  model.setViewName("CommandeClient/Bondesortie");
	  
	  return model;
	 }
	 	 
	 

}
