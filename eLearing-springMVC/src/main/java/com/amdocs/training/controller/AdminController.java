package com.amdocs.training.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.dao.impl.AdminDAOImpl;
import com.amdocs.training.model.Admin;
import com.amdocs.training.pojo.AdminPOJO;

import javafx.util.Pair;

@Controller
public class AdminController {

	AdminDAO adminDAO = new AdminDAOImpl();
	@GetMapping("/admin-list")
	public String AdminPage(Model model ){
		List<Admin> adminList=adminDAO.findAll();
		
		model.addAttribute("list",adminList);
		//model.addAttribute("message", "Welcome to eLearning Portal");
		return "Admin";
		
	}
	@GetMapping("/admin")
	public String adminHome(Model model) {
		//HashMap<Integer, String> map = new HashMap<>();
		model.addAttribute("admin", new AdminPOJO());
		
		//model.addAttribute("adminPOJO",);
		return "admin-home";
	}
	@PostMapping("/admin-login")
	public String adminPage(@ModelAttribute("admin") AdminPOJO p){
		System.out.println(p);
		Admin admin=adminDAO.getAdminById(p.getId());
		if(admin.getPassword().equals(p.getPassword()))
		{
			
			return "Admin";
		}
		else{
			
			return "loginFailed";
		}
	}
	@GetMapping("/addadmin")
	public String addAdminForm(Model model) {
		model.addAttribute("admin", new Admin());
		return "add-admin";
	}

	@PostMapping("/register")
	public String addUser(@ModelAttribute("admin") Admin u) {
		adminDAO.addAdmin(u);
		//System.out.println(u);
		return "redirect:/admin-list";
	}
	
	@GetMapping("/delete-admin/{admin_id}")
	public String deleteUser(@PathVariable("admin_id") int id) {
		adminDAO.deleteAdmin(id);
		return "redirect:/admin-list";
	}
	@GetMapping("/update-admin/{admin_id}")
	public String updateUserForm(@PathVariable("admin_id") int id, Model model) {
		Admin admin = adminDAO.getAdminById(id);
		model.addAttribute("admin", admin);
		return "update-admin";
	}

	@PostMapping("/update-admin")
	public String updateUser(@ModelAttribute("admin") Admin admin) {
		adminDAO.updateAdmin(admin);
		return "redirect:/admin-list";
	}
}
