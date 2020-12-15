package com.hcl.bb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hcl.bb.appexception.ApplicationException;
import com.hcl.bb.model.Admin;
import com.hcl.bb.model.RequestBlood;
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
			System.out.println(admin.getUserName());
			System.out.println(admin.getPassword());
			return "redirect:/adminRequestList";
			
		} catch (ApplicationException e) {
			model.addAttribute("error", e.getMessage());
			return "admin_login";
		}

	}
	
	@RequestMapping("adminRequestList")
	public String getRequestList(Model model)
	{
		List<RequestBlood> requestAdminList=adminService.getRequestList();
		System.out.println(requestAdminList.size());
		if(requestAdminList.size()>0)
		{
			
			model.addAttribute("requestAdminList",requestAdminList);
			return "admin_home";
		}
		else
		{
			model.addAttribute("message","No accept requests to show.");
			return "admin_home";
		}
	}

}