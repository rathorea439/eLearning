package com.amdocs.training.controller;

import java.util.List;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.dao.impl.ContactDAOImpl;
import com.amdocs.training.model.Contact;
public class ContactController {
	public static void main(String[] args) {
	ContactDAO dao = new ContactDAOImpl();
	
//	Contact contact = new Contact(1L, "krishna","krishna@abc.com", 3458546796L, "Messege",106 );
//	
//	boolean status = dao.addContact(contact);
//	if(status)
//		System.out.println("Contact Added Successfully");
//	
//	boolean result = dao.deleteContact(106L);
//	if(result)
//		System.out.println("Contact with Id "+106+ " is deleted successfully");
//	else
//		System.out.println("No Contact available");
//	
//	Contact contactById = dao.getContactById(104L);
//	System.out.println("detail of contact_Id 104 "+contactById);
	
	
//	Contact u = dao.getContactById(102L);
//	u.setName("supercontact");
//	System.out.println(u);
//	boolean updateContact = dao.updateContact(u);
//	if(updateContact)
//		System.out.println("contact updated successfully");
//	else
//		System.out.println("No Contact available");
//	
	List<Contact> list = dao.findAll();
	
	list.forEach(System.out::println);
}
}

