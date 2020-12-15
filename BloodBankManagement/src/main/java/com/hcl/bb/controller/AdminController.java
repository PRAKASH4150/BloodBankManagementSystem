package com.hcl.bb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.Admin;
import com.hcl.bb.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	private AdminService adminService;

	@RequestMapping("adminFront")
	public String adminLogin(Model model) {
		model.addAttribute("Adminlogin", new Admin());
		return "admin_login";
	}

	@PostMapping("adminValid")
	public String validateAdmin(@ModelAttribute("Adminlogin") Admin admin, Model model) {
		try {
			adminService.validateAdmin(admin);
			return "admin_home";
			
		} catch (ApplicationException e) {
			model.addAttribute("error", e.getMessage());
			return "admin";
		}

	}

}