package com.example.demo1.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo1.Service.BondecmndeService;
import com.example.demo1.model.Bondecmnde;

     @Controller
       public class BondecmndeController {

	 @Autowired
	 BondecmndeService bondecmndeService;
	 
	 //Fournisseur LIST
	 
	 @RequestMapping(value="/bondecmnde/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("CommandeClient/BondecmndeList");
	  List<Bondecmnde> BondecommandeList = bondecmndeService.getAllBondecmndes();
	  model.addObject("bondecmndeList",BondecommandeList);
	  return model;
	 }
	 
	 
	//Bondecmnde FORM
	 @RequestMapping(value="/addBondemcnde/", method=RequestMethod.GET)
	 public ModelAndView addBondecmnde() {
	  ModelAndView model = new ModelAndView(); 
	  Bondecmnde bondecmnde = new Bondecmnde();
	  model.addObject("bondecmndeForm", bondecmnde);
	  model.setViewName("CommandeClient/Bondecmnde");	  
	  return model;
	 }
	 
	 @RequestMapping(value="/saveBondecmnde", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("bondecmndeForm") Bondecmnde bondecmnde) {	 
		 bondecmndeService.saveOrUpdate(bondecmnde);	  
	  return new ModelAndView("redirect:/bondecmnde/list");
	 }
	 
	 
	
	//List des articles
	 
	 @RequestMapping(value="/Stock", method=RequestMethod.GET)
	 public ModelAndView Stock() {
	  ModelAndView model = new ModelAndView("Stock/Stock");
	  List<Bondecmnde> BondecommandeList = bondecmndeService.getAllBondecmndes();
	  model.addObject("bondecmndeList",BondecommandeList);
	  return model;
	  
	  
	  
	  
	  
	  
	 }	 
	 @RequestMapping(value = "/deleteBondecmnde/{idbondecmnde}", method = RequestMethod.GET)
		public String delete(@PathVariable("idbondecmnde") long idbondecmnde) {
		 bondecmndeService.deleteBondecmnde(idbondecmnde);
		return "redirect:/bondecmnde/list";	 
	 }
		
	 
	 //editbonddecommande
	 
     @RequestMapping(value="/updateBondecomnde/{idbondecommande}", method=RequestMethod.GET)	 
	 public ModelAndView editArticle(@PathVariable long idbondecommande) {		 
	  ModelAndView model = new ModelAndView();	  
	  Bondecmnde bondecmnde =  bondecmndeService.getBondecmndeById(idbondecommande);
	  model.addObject("bondecmndeForm",bondecmnde);
	  model.setViewName("CommandeClient/Bondecmnde");	  
	  return model;
	 }
	 
}
