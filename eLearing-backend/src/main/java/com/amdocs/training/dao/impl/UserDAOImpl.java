package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.training.dao.UserDAO;
import com.amdocs.training.model.User;
import com.amdocs.training.DBUtil;

public class UserDAOImpl implements UserDAO {

	Connection conn = DBUtil.getConnection();

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<User>();
		String sql = "select * from user";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Long id = (long) rs.getInt("id");
				String name = rs.getString("name");
				Long phone_no=rs.getLong("phone_no");
				String email = rs.getString("email");
				String address = rs.getString("address");
				String password = rs.getString("password");
				User user = new User(id, name,phone_no, password, email, address);
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

		String query = "insert into user values(?,?,?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, user.getId());
			ps.setString(2, user.getUsername());
			ps.setLong(3, user.getPhone_no());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getPassword());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public User getUserById(Long id) {
		String query = "select * from user where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
			Long id1 = (long) rs.getInt("id");
			String name = rs.getString("name");
			Long phone_no=rs.getLong("phone_no");
			String email = rs.getString("email");
			String address = rs.getString("address");
			String password = rs.getString("password");
			User user = new User(id1, name,phone_no, password, email, address);
			return user;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteUser(Long id) {
		String query = "delete from user where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, id);
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
		String query = "update user set id =?,name = ?,phone_no=?,email=?,address=?,password=? where id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, user.getId());
			ps.setString(2, user.getUsername());
			ps.setLong(3, user.getPhone_no());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getAddress());
			ps.setString(6, user.getPassword());
			ps.setLong(7, user.getId()); 
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
