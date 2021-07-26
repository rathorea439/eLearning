package com.amdocs.training.dao;

import java.util.List;

import com.amdocs.training.model.Feedback;

public interface FeedbackDAO {

	List<Feedback> findAll();

	boolean addFeedback(Feedback feedback);

	Feedback getFeedbackById(int id);

	boolean deleteFeedback(int id);
	
	boolean updateFeedback(Feedback feedback);
}