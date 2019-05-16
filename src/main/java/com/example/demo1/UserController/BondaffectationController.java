package com.example.demo1.UserController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo1.Service.BondaffectationService;
import com.example.demo1.model.Bondaffectation;

@Controller
public class BondaffectationController {
	
	
	@Autowired
	 BondaffectationService bondaffectationService;
	
	@RequestMapping(value="/Bondaffectation/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("CommandeClient/BondaffectationList");
	  List<Bondaffectation> bondaffectationList = bondaffectationService.FindAllBondaffectations();
	  model.addObject("BondaffectationList",bondaffectationList);

	  return model;
	 }
	

	 @RequestMapping(value="/addBondaffectation/", method=RequestMethod.GET)

	 public ModelAndView addbondaffectation() {
	  ModelAndView model = new ModelAndView();
	  
	  Bondaffectation bondaffectation = new Bondaffectation();
	  model.addObject("BondaffectationForm",bondaffectation);
	  model.setViewName("CommandeClient/Bondaffctation");
	  
	  return model;
	 }
	 
	 
	 @RequestMapping(value="/saveBondaffectation", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("BondaffectationForm") Bondaffectation bondaffectation) {
		 bondaffectationService.saveOrUpdate(bondaffectation);
	  	  
	  return new ModelAndView("redirect:Bondaffectation/list");
	 }
	 
	 
	 @RequestMapping(value="/deleteBondeRetour/{idbondaffectation}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("idbondaffectation") long  idbondaffectation) {
		 bondaffectationService.deleteBondaffectation(idbondaffectation);
	  
	  return new ModelAndView("redirect:Bondaffectation/list");
	 }

	
	 
	 @RequestMapping(value="/updateBondeRetour/{idbondaffectation}", method=RequestMethod.GET)
	 
	 public ModelAndView editArticle(@PathVariable long idbondaffectation) {
		 
	  ModelAndView model = new ModelAndView();
	  
	  Bondaffectation bondaffectation = bondaffectationService.getBondaffectationById(idbondaffectation);
	  model.addObject("BondaffectationForm",bondaffectation);
	  model.setViewName("CommandeClient/Bondaffctation");
	  
	  return model;
	 }
	

}
