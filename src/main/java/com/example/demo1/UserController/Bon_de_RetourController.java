package com.example.demo1.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.Service.Bon_de_RetourService;
import com.example.demo1.model.BonDeRetour;
@Controller
public class Bon_de_RetourController {

	 @Autowired
	 Bon_de_RetourService Bon_de_RetourService;
	
	@RequestMapping(value="/BondeRetour/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("CommandeClient/BondeRetourList");
	  List<BonDeRetour> bonDeRetourList = Bon_de_RetourService.getAllBonDeRetours();
	  model.addObject("BonDeRetourList",bonDeRetourList);

	  return model;
	 }
	

	 @RequestMapping(value="/addBonDeRetour/", method=RequestMethod.GET)

	 public ModelAndView addFournisseur() {
	  ModelAndView model = new ModelAndView();
	  
	  BonDeRetour bonDeRetour = new BonDeRetour();
	  model.addObject("BondeRetourForm",bonDeRetour);
	  model.setViewName("CommandeClient/BondeRetour");
	  
	  return model;
	 }

	 
	 
	 @RequestMapping(value="/saveBondeRetour", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("BondeRetourForm") BonDeRetour BonDeRetour) {
		 Bon_de_RetourService.saveOrUpdate(BonDeRetour);
	  	  
	  return new ModelAndView("redirect:BondeRetour/list");
	 }
	 
	 
	 
	 
	 
	 @RequestMapping(value="/deleteBondeRetour/{idbondeRetour}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("idbondeRetour") long idbondeRetour) {
		 Bon_de_RetourService.deleteBonDeRetour(idbondeRetour);
	  
	  return new ModelAndView("redirect:BondeRetour/list");
	 }

	 
	 @RequestMapping(value="/updateBondeRetour/{idbondeRetour}", method=RequestMethod.GET)	 
	 public ModelAndView Edit(@PathVariable long idbondeRetour) {		 
	  ModelAndView model = new ModelAndView();	  
	  BonDeRetour bonDeRetour =  Bon_de_RetourService.getBonDeRetourById(idbondeRetour);
	  model.addObject("BondeRetourForm",bonDeRetour);
	  model.setViewName("CommandeClient/BondeRetour");	  
	  return model;
	 }
	 
	
}
