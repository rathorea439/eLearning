package com.amdocs.training.controller;

import java.util.List;

import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.dao.impl.FeedbackDAOImpl;
import com.amdocs.training.model.Feedback;

public class FeedbackController {

	public static void main(String[] args) {
		FeedbackDAO dao = new FeedbackDAOImpl();
		
//		Feedback feedback = new Feedback(2, "krishna","krishna@abc.com",3,"excellent" );
//		
//		boolean status = dao.addFeedback(feedback);
//		if(status)
//			System.out.println("Feedback Added Successfully");
//		
//		boolean result = dao.deleteFeedback(3);
//		if(result)
//			System.out.println("Feedback with Id "+3+ " is deleted successfully");
//		else
//			System.out.println("No Feedback available");
//		
//		Feedback feedbackById = dao.getFeedbackById(2);
//		System.out.println("detail of feedback_Id 2 "+feedbackById);
		
		
//		Feedback u = dao.getFeedbackById(2);
//		u.setName("superfeedback");
//		System.out.println(u);
//		boolean updateFeedback = dao.updateFeedback(u);
//		if(updateFeedback)
//			System.out.println("feedback updated successfully");
//		else
//			System.out.println("No Feedback available");
//		
		List<Feedback> list = dao.findAll();
		
		list.forEach(System.out::println);
	}

}
