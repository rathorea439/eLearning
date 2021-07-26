package com.amdocs.training.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.dao.impl.CourseDAOImpl;
import com.amdocs.training.model.Course;
import com.amdocs.training.model.Course;


@Controller
public class CourseController {
	//CourseDAO courseDAO = new CourseDAOImpl();
	CourseDAO courseDAO = new CourseDAOImpl() ;
	@GetMapping("/course-list")
	public String CoursePage(Model model ){
		List<Course> courseList=courseDAO.findAll();
		
		model.addAttribute("list",courseList);
		model.addAttribute("message", "Welcome to eLearning Portal");
		return "Course";
		
	}
	@GetMapping("/addcourse")
	public String addCourseForm(Model model) {
		model.addAttribute("course", new Course());
		return "add-course";
	}
	@PostMapping("/register1")
	public String addCourse(@ModelAttribute("course") Course u) {
		courseDAO.addCourse(u);
		return "redirect:/course-list";
	}
	@GetMapping("/delete-course/{course_id}")
	public String deleteCourse(@PathVariable("course_id") int id) {
		courseDAO.deleteCourse(id);
		return "redirect:/course-list";
	}
	@GetMapping("/update-course/{course_id}")
	public String updatecourseForm(@PathVariable("course_id") int id, Model model) {
		Course course = courseDAO.getCourseById(id);
		model.addAttribute("course", course);
		return "update-course";
	}

	@PostMapping("/update-course")
	public String updateCourse(@ModelAttribute("course") Course course) {
		courseDAO.updateCourse(course);
		return "redirect:/course-list";
	}
}
