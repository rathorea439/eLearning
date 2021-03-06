package com.amdocs.training.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.impl.ContactDAOImpl;
import com.amdocs.training.model.Contact;



@Controller
public class ContactController {
	//ContactDAO contactDAO = new ContactDAOImpl();
	ContactDAO contactDAO = new ContactDAOImpl() ;
	@GetMapping("/contact-list")
	public String ContactPage(Model model ){
		List<Contact> contactList=contactDAO.findAll();
		
		model.addAttribute("list",contactList);
		model.addAttribute("message", "Welcome to eLearning Portal");
		return "Contact";
		
	}
	@GetMapping("/addcontact")
	public String addContactForm(Model model) {
		model.addAttribute("contact", new Contact());
		return "add-contact";
	}
	@PostMapping("/register4")
	public String addContact(@ModelAttribute("contact") Contact u) {
		contactDAO.addContact(u);
		return "redirect:/contact-list";
	}
	@GetMapping("/delete-contact/{contact_id}")
	public String deleteContact(@PathVariable("contact_id") int id) {
		contactDAO.deleteContact(id);
		return "redirect:/contact-list";
	}
	@GetMapping("/update-contact/{contact_id}")
	public String updatecontactForm(@PathVariable("contact_id") int id, Model model) {
		Contact contact = contactDAO.getContactById(id);
		model.addAttribute("contact", contact);
		return "update-contact";
	}

	@PostMapping("/update-contact")
	public String updateContact(@ModelAttribute("contact") Contact contact) {
		contactDAO.updateContact(contact);
		return "redirect:/contact-list";
	}
}
