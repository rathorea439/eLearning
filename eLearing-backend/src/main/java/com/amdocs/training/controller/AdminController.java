package com.amdocs.training.controller;

import java.util.List;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.dao.impl.AdminDAOImpl;
import com.amdocs.training.model.Admin;

public class AdminController {

	public static void main(String[] args) {
		AdminDAO dao = new AdminDAOImpl();
		
//		Admin admin = new Admin(6, "krishna","krishna@abc.com","krishna@amdocs" );
//		
//		boolean status = dao.addAdmin(admin);
//		if(status)
//			System.out.println("Admin Added Successfully");
//		
//		boolean result = dao.deleteAdmin(6);
//		if(result)
//			System.out.println("Admin with Id "+6+ " is deleted successfully");
//		else
//			System.out.println("No Admin available");
//		
//		Admin adminById = dao.getAdminById(4);
//		System.out.println("detail of admin_Id 104 "+adminById);
		
		
//		Admin u = dao.getAdminById(2);
//		u.setName("superadmin");
//		System.out.println(u);
//		boolean updateAdmin = dao.updateAdmin(u);
//		if(updateAdmin)
//			System.out.println("admin updated successfully");
//		else
//			System.out.println("No Admin available");
//		
		List<Admin> list = dao.findAll();
		
		list.forEach(System.out::println);
	}

}
