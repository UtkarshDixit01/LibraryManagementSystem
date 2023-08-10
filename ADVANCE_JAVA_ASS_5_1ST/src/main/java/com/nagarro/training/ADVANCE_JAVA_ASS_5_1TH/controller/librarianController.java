package com.nagarro.training.ADVANCE_JAVA_ASS_5_1TH.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.training.ADVANCE_JAVA_ASS_5_1TH.entity.Librarian;
import com.nagarro.training.ADVANCE_JAVA_ASS_5_1TH.services.LibrarianServices;

@Controller
@RequestMapping("/librarian")
public class librarianController {

	
	private final LibrarianServices librarianService;
	
	@Autowired
	public librarianController(final LibrarianServices librarianService) {
		this.librarianService=librarianService;
	}
	
	@GetMapping(path="/loginPage")
	public String loginPage() {
		return "loginPage";
	}
	
	@GetMapping(path="/login")
	public ModelAndView login(@RequestParam("email")String email, @RequestParam("password")String password,HttpServletResponse response) {

		Librarian librarian=librarianService.getLibrarianByEmail(email);
		ModelAndView mv=null;
		if (librarian == null) {
			mv = new ModelAndView();
			mv.addObject("doesExists", false);
			mv.setViewName("loginPage");
		}else if (!librarian.getpassword().equals(password)){
			mv = new ModelAndView();
			mv.addObject("doesExists", false);
			mv.setViewName("loginPage");
		}else {
			Cookie ck = new Cookie("librarian", email);
			ck.setPath("/");
			response.addCookie(ck);
			mv = new ModelAndView("redirect:/books/bookManagement");
		}
		return mv;
	}
	
	@GetMapping(path="/logout")
	public ModelAndView logout(HttpServletResponse response) {
		Cookie ck = new Cookie("librarian", null);
		ck.setMaxAge(0);
		ck.setPath("/");
		response.addCookie(ck);
		ModelAndView mv = new ModelAndView("redirect:loginPage");
		return mv;
	}
	
}
