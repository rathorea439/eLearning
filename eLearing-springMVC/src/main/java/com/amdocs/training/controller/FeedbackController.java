package com.amdocs.training.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.impl.FeedbackDAOImpl;
import com.amdocs.training.model.Feedback;



@Controller
public class FeedbackController {
	//FeedbackDAO feedbackDAO = new FeedbackDAOImpl();
	FeedbackDAO feedbackDAO = new FeedbackDAOImpl() ;
	@GetMapping("/feedback-list")
	public String FeedbackPage(Model model ){
		List<Feedback> feedbackList=feedbackDAO.findAll();
		
		model.addAttribute("list",feedbackList);
		model.addAttribute("message", "Welcome to eLearning Portal");
		return "Feedback";
		
	}
	@GetMapping("/addfeedback")
	public String addFeedbackForm(Model model) {
		model.addAttribute("feedback", new Feedback());
		return "add-feedback";
	}
	@PostMapping("/register3")
	public String addFeedback(@ModelAttribute("feedback") Feedback u) {
		feedbackDAO.addFeedback(u);
		return "redirect:/feedback-list";
	}
	@GetMapping("/delete-feedback/{feedback_id}")
	public String deleteFeedback(@PathVariable("feedback_id") int id) {
		feedbackDAO.deleteFeedback(id);
		return "redirect:/feedback-list";
	}
	@GetMapping("/update-feedback/{feedback_id}")
	public String updatefeedbackForm(@PathVariable("feedback_id") int id, Model model) {
		Feedback feedback = feedbackDAO.getFeedbackById(id);
		model.addAttribute("feedback", feedback);
		return "update-feedback";
	}

	@PostMapping("/update-feedback")
	public String updateFeedback(@ModelAttribute("feedback") Feedback feedback) {
		feedbackDAO.updateFeedback(feedback);
		return "redirect:/feedback-list";
	}
}
