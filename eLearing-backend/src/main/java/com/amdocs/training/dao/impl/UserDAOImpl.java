package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.model.User;
import com.amdocs.training.DBUtil;
public class UserDAOImpl implements UserDAO {
	DataSource dataSource = DBUtil.dataSource();
	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		String sql = "select * from user1";
		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id =  rs.getInt("user_id");
				String name = rs.getString("name");
				Long phone_no=rs.getLong("phone_no");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String reg_date = rs.getString("reg_date");
				String password = rs.getString("password");
				String upload_photo = rs.getString("upload_photo");
				User user = new User(id, name,phone_no,  email, address,reg_date,password,upload_photo);
				users.add(user);
			}
			return users;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addUser(User user) {

		String query = "insert into user1 values(?,?,?,?,?,?,?,?)";

		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setInt(1, user.getUser_id());
			ps.setString(2, user.getName());
			ps.setLong(3, user.getPhone_no());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getReg_date());
			ps.setString(7, user.getPassword());
			ps.setString(8, user.getUpload_photo());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public User getUserById(int id) {
		String query = "select * from user1 where user_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int id1 =  rs.getInt("user_id");
				String name = rs.getString("name");
				Long phone_no=rs.getLong("phone_no");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String reg_date = rs.getString("reg_date");
				String password = rs.getString("password");
				String upload_photo = rs.getString("upload_photo");
				User user = new User(id1, name,phone_no,  email, address,reg_date,password,upload_photo);
				return user;			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteUser(int id) {
		String query = "delete from user1 where user_id = ?";
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
	public boolean updateUser(User user) {
		String query = "update user1 set user_id =?,name = ?,phone_no=?,email=?,address=?,reg_date=?,password=?,upload_photo=? where user_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, user.getUser_id());
			ps.setString(2, user.getName());
			ps.setLong(3, user.getPhone_no());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getReg_date());
			ps.setString(7, user.getPassword());
			ps.setString(8, user.getUpload_photo());
			ps.setInt(9, user.getUser_id());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
//@Override
//public boolean addUser(User user) {
//	// TODO Auto-generated method stub
//	return false;
//}
//@Override
//public User getUserById(int id) {
//	// TODO Auto-generated method stub
//	return null;
//}
//@Override
//public boolean deleteUser(int id) {
//	// TODO Auto-generated method stub
//	return false;
//}
//@Override
//public boolean updateUser(User user) {
//	// TODO Auto-generated method stub
//	return false;
//}
//}
//public class UserDAOImpl implements UserDAO {
//
//Connection conn = DBUtil.getConnection();
//
//@Override
//public List<User> findAll() {
//	List<User> users = new ArrayList<User>();
//	String sql = "select * from user1";
//	try {
//		Statement stmt = conn.createStatement();
//		ResultSet rs = stmt.executeQuery(sql);
//
//		while (rs.next()) {
//			int id =  rs.getInt("user_id");
//			String name = rs.getString("name");
//			Long phone_no=rs.getLong("phone_no");
//			String email = rs.getString("email");
//			String address = rs.getString("address");
//			String reg_date = rs.getString("reg_date");
//			String password = rs.getString("password");
//			String upload_photo = rs.getString("upload_photo");
//			User user = new User(id, name,phone_no,  email, address,reg_date,password,upload_photo);
//			users.add(user);
//		}
//		return users;
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	return null;
//}
//
