package com.cjc.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.main.model.Student;
import com.cjc.main.service.HomeService;

@Controller
public class HomeController 
{
	@Autowired
	HomeService hs;
	
	
	@RequestMapping("/")
	public String preLogin()
	{
		return "login";
		
	}
	@RequestMapping("/registration")
	public String preRegister()
	{
		return "registration";
		
	}
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute Student stu)
	{
		hs.saveUser(stu);
		return "login";
	}
	@RequestMapping("/login")
	public String loginCheck(@RequestParam ("uname") String un,@RequestParam ("password") String ps,Model m)
	{
		hs.loginCheck(un,ps);
	
		Iterable<Student> list=hs.displayAll();
		m.addAttribute("data", list);
		return "success";
		
	}
	@RequestMapping("/delete")
	public String deleteData(@RequestParam("id") int id,Model m)
	{
		hs.deleteData(id);
		Iterable<Student> list=hs.displayAll();
		m.addAttribute("data", list);
		return "success";
		
	}
	@RequestMapping("/edit")
	public String editData(@RequestParam("id") int id,Model m)
	{
		Student s=hs.editData(id);
		m.addAttribute("data", s);
		return "edit";
		
	}
	@RequestMapping("/update")
	public String updateData(@ModelAttribute Student s,Model m)
	{
		hs.saveUser(s);
		Iterable<Student> list=hs.displayAll();
		m.addAttribute("data", list);
		return "success";
		
	}
}
