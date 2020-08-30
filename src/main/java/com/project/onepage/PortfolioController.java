package com.project.onepage;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PortfolioController {
	
	@Autowired
	PortfolioService portfolioService;
	
	@RequestMapping("/userform")
	public String showform2(Model m) {
		m.addAttribute("command", new User());
		return "userform";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String userAdd(@ModelAttribute("user") User user, Locale locale, Model model) {

		portfolioService.joinuser(user);
		return "userform";
	}

}
