package com.amdocs.training.controller;

import java.util.List;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.dao.impl.UserDAOImpl;
import com.amdocs.training.model.User;

public class UserController {

	public static void main(String[] args) {
		UserDAO dao = new UserDAOImpl();
		
//		User user = new User(7, "krishna", 3458546796L ,"krishna@abc.com", "New Delhi","2021-02-03","krishna@amdocs","imp.jpg");
//		
//		boolean status = dao.addUser(user);
//		if(status)
//			System.out.println("User Added Successfully");
////		
		boolean result = dao.deleteUser(6);
		if(result)
			System.out.println("User with Id "+102+ " is deleted successfully");
		else
			System.out.println("No User available");
//		
//		User userById = dao.getUserById(6);
//		System.out.println("detail of user_Id 104 "+userById);
		
		
//		User u = dao.getUserById(6);
//		u.setName("superuser");
//		System.out.println(u);
//		boolean updateUser = dao.updateUser(u);
//		if(updateUser)
//			System.out.println("user updated successfully");
//		else
//			System.out.println("No User available");
		
		List<User> list = dao.findAll();
		
		list.forEach(System.out::println);
	}

}
