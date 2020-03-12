package com.cg.web.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.core.services.EmpServices;

//	http://localhost:9090/Spring110_MVCWebflow/empService/home.do

@Controller
@RequestMapping("/empService")
public class EmpController {
	@Autowired
	EmpServices service;
	
	@RequestMapping("/home.do")
	public String getHomePage(){
		return "Home";
	}
	
	
	@RequestMapping("/login.do")
	public String getLoginPage(){
		return "Login";
	}
	
	@RequestMapping("/authenticate.do")
/*	public String authenticate(HttpServletRequest req, HttpServletResponse resp){
		String uname = req.getParameter("userName");
		String pass = req.getParameter("password");*/
	public ModelAndView authenticate(
			@RequestParam("userName") String uname,
			@RequestParam("password") String pass)	{
		//System.out.println("In Authenticate:"+uname+":"+pass);
		String fullname = service.authenticates(uname, pass);
		ModelAndView mAndV = null;
		if(fullname != null){
			mAndV = new ModelAndView("MainMenu");
			mAndV.addObject("fullName", fullname);
		}
		else{
			mAndV = new ModelAndView("Login");
			mAndV.addObject("msg", "Authentication Failed! Try Again.");
		}
		return mAndV;
	}
}
