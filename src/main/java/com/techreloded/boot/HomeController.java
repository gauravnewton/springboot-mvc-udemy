package com.techreloded.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techreloded.model.Aliean;

// TODO: Auto-generated Javadoc
/**
 * The Class HomeController.
 */
@Controller
public class HomeController {

	/**
	 * Home.
	 */
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called..........");
		return "index";
	}
	
	@RequestMapping("add")
	public ModelAndView Calculate( @RequestParam("num1") int num1, @RequestParam("num2") int num2 ){
		ModelAndView mv = new ModelAndView("result");
		int num3 = num1 + num2;
		mv.addObject("num3",num3);
		return mv;
	}
	
	
	
//	@PostMapping("addAliean")
//	public String save( @ModelAttribute("aliean") Aliean a){
//		System.out.println("form submitted..");
//		return "result";
//	}
	
	
	@RequestMapping(value = "addAliean", method= RequestMethod.POST)
	public String savePost( @ModelAttribute("aliean") Aliean a){
		System.out.println("form submitted..");
		return "result";
	}
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","Alieans");
	}
}

