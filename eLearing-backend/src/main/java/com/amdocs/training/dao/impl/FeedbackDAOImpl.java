package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.amdocs.training.dao.FeedbackDAO;
import com.amdocs.training.model.Feedback;
import com.amdocs.training.DBUtil;

public class FeedbackDAOImpl implements FeedbackDAO {

	DataSource dataSource = DBUtil.dataSource();
	

	@Override
	public List<Feedback> findAll() {
		List<Feedback> feedbacks = new ArrayList<Feedback>();
		String sql = "select * from feedback";
		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id =  rs.getInt("user_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int f_id=rs.getInt("f_id");
				String feed = rs.getString("feedback");
				Feedback feedback = new Feedback(id, name,email, f_id, feed);
				feedbacks.add(feedback);
			}
			return feedbacks;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addFeedback(Feedback feedback) {

		String query = "insert into feedback values(?,?,?,?,?)";

		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, feedback.getUser_id());
			ps.setString(2, feedback.getName());
			ps.setString(3, feedback.getEmail());
			ps.setInt(4, feedback.getF_id());
			ps.setString(5, feedback.getFeedback());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Feedback getFeedbackById(int id) {
		String query = "select * from feedback where f_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int id1 =  rs.getInt("user_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				int f_id=rs.getInt("f_id");
				String feed = rs.getString("feedback");
				Feedback feedback = new Feedback(id1, name,email, f_id, feed);
			return feedback;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteFeedback(int id) {
		String query = "delete from feedback where f_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			System.out.println(id);
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateFeedback(Feedback feedback) {
		String query = "update feedback set user_id =?,name = ?,email=?,f_id=?,feedback=? where f_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, feedback.getUser_id());
			ps.setString(2, feedback.getName());
			ps.setString(3, feedback.getEmail());
			ps.setInt(4, feedback.getF_id());
			ps.setString(5, feedback.getFeedback());
			ps.setInt(6, feedback.getF_id()); 
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
