package com.amdocs.training.controller;

import java.util.List;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.impl.CourseDAOImpl;
import com.amdocs.training.model.Course;

public class CourseController {

	public static void main(String[] args) {
		CourseDAO dao = new CourseDAOImpl();
		
//		Course course = new Course(114, "ruby","programming language" ,"344", "vide.mp4");
//		
//		boolean status = dao.addCourse(course);
//		if(status)
//			System.out.println("Course Added Successfully");
//		
//		boolean result = dao.deleteCourse(114);
//		if(result)
//			System.out.println("Course with Id "+114+ " is deleted successfully");
//		else
//			System.out.println("No Course available");
//		
//		Course courseById = dao.getCourseById(112);
//		System.out.println("detail of course_Id 104 "+courseById);
//		
//		
//		Course u = dao.getCourseById(112);
//		u.setC_name("supercourse");
//		System.out.println(u);
//		boolean updateCourse = dao.updateCourse(u);
//		if(updateCourse)
//			System.out.println("course updated successfully");
//		else
//			System.out.println("No Course available");
//		
		List<Course> list = dao.findAll();
		
		list.forEach(System.out::println);
	}

}
