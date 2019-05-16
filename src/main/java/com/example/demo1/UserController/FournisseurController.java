package com.example.demo1.UserController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.Service.FournissuerService;
import com.example.demo1.model.Article;
import com.example.demo1.model.Fournisseur;

@Controller
public class FournisseurController {

	 @Autowired
	 FournissuerService FournisseurService;
 
	 @RequestMapping(value="/Fournisseur/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("Fournisseurs/Fournisseurs");
	  List<Fournisseur> FournisseurList = FournisseurService.getAllFournisseurs();
	 // Collections.sort(FournisseurList);
	  model.addObject("fournisseurList", FournisseurList);
	  return model;
	 }
	 
	//Fournisseur FORM
	 @RequestMapping(value="/addFournisseur/", method=RequestMethod.GET)

	 public ModelAndView addFournisseur() {
	  ModelAndView model = new ModelAndView();
	  
	  Fournisseur fournisseur = new Fournisseur();
	  model.addObject("FournisseurForm", fournisseur);
	  model.setViewName("Fournisseurs/AddFournisseur");
	  
	  
	  return model;
	 }

	 
	 
	 @RequestMapping(value="/saveFournisseur", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("FournisseurForm") Fournisseur fournisseur) {
	  FournisseurService.saveOrUpdate(fournisseur);
	  	  
	  return new ModelAndView("redirect:Fournisseur/list");
	 }
	 
	 
	 @RequestMapping(value="/deleteFournisseur/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") long id) {
	  FournisseurService.deleteFournisseur(id);
	  
	  return new ModelAndView("redirect:Fournisseur/list");
	 }

	
}
