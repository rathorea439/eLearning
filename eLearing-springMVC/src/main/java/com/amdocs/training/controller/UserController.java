package com.amdocs.training.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.ContactDAOImpl;
import com.amdocs.training.dao.impl.CourseDAOImpl;
import com.amdocs.training.dao.impl.FeedbackDAOImpl;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.Admin;
import com.amdocs.training.model.Contact;
import com.amdocs.training.model.Course;
import com.amdocs.training.model.Feedback;
import com.amdocs.training.model.User;
import com.amdocs.training.pojo.AdminPOJO;
import com.amdocs.training.pojo.UserPOJO;



@Controller
public class UserController {

	UserDAO userDAO = new UserDAOImpl() ;
	
	@GetMapping("/user")
	public String userPage(Model model) {
		
		
		//model.addAttribute("adminPOJO",);
		return "user-home";
	}
	@GetMapping("/userlogin")
	public String userLogin(Model model) {
		model.addAttribute("user", new User());
		
		//model.addAttribute("adminPOJO",);
		return "user-login";
	}
	@PostMapping("/user-login")
	public String userLoginPage(@ModelAttribute("user") User p,Model model){
		System.out.println(p);
		User user=userDAO.getUserById(p.getUser_id());
		if(user.getPassword().equals(p.getPassword()))
		{
			
			return "user-id-page";
		}
		else
		return "loginFailed";
	}
	@GetMapping("/user-list")
	public String UserPage(Model model ){
		List<User> userList=userDAO.findAll();
		
		model.addAttribute("list",userList);
		model.addAttribute("message", "Welcome to eLearning Portal");
		return "User";
		
	}
	@GetMapping("/user-registration")
	public String addUser(Model model) {
		model.addAttribute("user", new User());
		return "userRegister";
	}
	@PostMapping("/userregister")
	public String adduser(@ModelAttribute("user") User u) {
		userDAO.addUser(u);
		return "RegisterSuccess1";
	}
	@GetMapping("/adduser")
	public String addUserForm(Model model) {
		model.addAttribute("user", new User());
		return "add-user";
	}
	
	@PostMapping("/register2")
	public String addUser(@ModelAttribute("user") User u) {
		userDAO.addUser(u);
		return "redirect:/user-list";
	}
	@GetMapping("/delete-user/{user_id}")
	public String deleteUser(@PathVariable("user_id") int id) {
		userDAO.deleteUser(id);
		return "redirect:/user-list";
	}
	@GetMapping("/update-user/{user_id}")
	public String updateuserForm(@PathVariable("user_id") int id, Model model) {
		User user = userDAO.getUserById(id);
		model.addAttribute("user", user);
		return "update-user";
	}

	@PostMapping("/update-user")
	public String updateUser(@ModelAttribute("user") User user) {
		userDAO.updateUser(user);
		return "redirect:/user-list";
	}
	@GetMapping("/view-course")
	public String viewcourse(Model model) {
		CourseDAO courseDAO = new CourseDAOImpl() ;
		List<Course> courseList=courseDAO.findAll();
		model.addAttribute("list", courseList);
		return "view-only-course";
	}
	@GetMapping("/give-feedback")
	public String userfeedback(Model model) {
		model.addAttribute("feedback", new Feedback());
		
		//model.addAttribute("adminPOJO",);
		return "give-feedback";
	}
	@PostMapping("/addfeed")
	public String addFeedback(@ModelAttribute("feedback") Feedback u) {
		FeedbackDAO feedbackDAO=new FeedbackDAOImpl();
		feedbackDAO.addFeedback(u);
		return "success";
	}
	
}
