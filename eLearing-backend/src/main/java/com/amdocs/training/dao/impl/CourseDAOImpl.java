package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.training.dao.CourseDAO;
import com.amdocs.training.model.Course;
import com.amdocs.training.DBUtil;

public class CourseDAOImpl implements CourseDAO {

	Connection conn = DBUtil.getConnection();

	@Override
	public List<Course> findAll() {
		List<Course> courses = new ArrayList<Course>();
		String sql = "select * from course";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id =  rs.getInt("course_id");
				String c_name = rs.getString("c_name");
				String c_desp = rs.getString("c_desp");
				String c_fees = rs.getString("c_fees");
				String c_resource = rs.getString("c_resource");
				Course course = new Course(id, c_name,c_desp,c_fees,c_resource);
				courses.add(course);
			}
			return courses;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addCourse(Course course) {

		String query = "insert into course values(?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, course.getCourse_id());
			ps.setString(2, course.getC_name());
			ps.setString(3, course.getC_desp());
			ps.setString(4, course.getC_fees());
			ps.setString(5, course.getC_resource());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Course getCourseById(int id) {
		String query = "select * from course where course_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int id1 =  rs.getInt("course_id");
				String c_name = rs.getString("c_name");
				String c_desp = rs.getString("c_desp");
				String c_fees = rs.getString("c_fees");
				String c_resource = rs.getString("c_resource");
				Course course = new Course(id1, c_name,c_desp,c_fees,c_resource);
			return course;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteCourse(int id) {
		String query = "delete from course where course_id = ?";
		try {
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
	public boolean updateCourse(Course course) {
		String query = "update course set course_id =?,c_name = ?,c_desp=?,c_fees=?,c_resource=? where course_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, course.getCourse_id());
			ps.setString(2, course.getC_name());
			ps.setString(3, course.getC_desp());
			ps.setString(4, course.getC_fees());
			ps.setString(5, course.getC_resource());
			ps.setInt(6, course.getCourse_id()); 
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
