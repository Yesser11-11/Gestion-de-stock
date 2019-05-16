package com.example.demo1.UserController;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo1.Service.UserService;
import com.example.demo1.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value = { "/signin" }, method = RequestMethod.GET)
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("user/signin"); // resources/template/login.html
		return modelAndView;
	}

	@RequestMapping(value = { "/signup" }, method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		 User user = new User();
		 modelAndView.addObject("user", user); 
		modelAndView.setViewName("user/signup"); // resources/template/register.html
		return modelAndView;
	}	
	
	@RequestMapping(value = { "/Admin/Admin" }, method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("Admin/Admin"); // resources/template/home.html
		return modelAndView;
	}
	
	
	@RequestMapping(value = { "/home/home" }, method = RequestMethod.GET)
	public ModelAndView Clienthome() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home/home"); // resources/template/home.html
		return modelAndView;
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public ModelAndView registerUser(@Valid User user, BindingResult bindingResult, ModelMap modelMap) {
		ModelAndView modelAndView = new ModelAndView();
		// Check for the validations
		if(bindingResult.hasErrors()) {
			modelAndView.addObject("successMessage", "Please correct the errors in form!");
			modelMap.addAttribute("bindingResult", bindingResult);
		}
		else if(userService.isUserAlreadyPresent(user)){
			modelAndView.addObject("successMessage", "user already exists!");			
		}
		// we will save the user if, no binding errors
		else {
			userService.saveUser(user);
			modelAndView.addObject("successMessage", "User is registered successfully!");
		}
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("user/signup");
		return modelAndView;
	}
	
	
 //Article LIST
 @GetMapping(value="/Client/list")
 public ModelAndView list() {
  ModelAndView model = new ModelAndView("Client/Client");
  
  List<User> userList = userService.findAll();
  model.addObject("userList", userList);
  return model;
 }
 

 
 @RequestMapping(value="/deleteUser/{id}", method=RequestMethod.GET)
 public ModelAndView delete(@PathVariable("id") long id) {
  userService.deleteById(id);
  
  return new ModelAndView("redirect:/Client/list");
 }

 
 
}