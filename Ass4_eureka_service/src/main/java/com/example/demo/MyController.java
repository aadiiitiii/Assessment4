package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@Autowired
	private LoginDAO obj;
	
	@RequestMapping("/")
	public String getPage() {
		return "home.jsp";
	}
	
	@RequestMapping("/login_page")
	public String add(Login l) {
		Login o= obj.findById(l.getId()).orElse(null);
		if(o.getId()==l.getId() && o.getPassword()==l.getPassword() && o.getUsername()==l.getUsername()) {
			
		}
		else {
			o=null;
		}
		System.out.println(o);
		System.out.println(l);
		if(o==null) {
			System.out.println("Fail");
			return "fail.jsp";
		}
		else {
			System.out.println("Success");
			return "success.jsp";
		}
	}
}
