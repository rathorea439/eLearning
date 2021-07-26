package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.amdocs.training.dao.AdminDAO;
import com.amdocs.training.model.Admin;
import com.amdocs.training.DBUtil;

public class AdminDAOImpl implements AdminDAO {

	Connection conn = DBUtil.getConnection();

	@Override
	public List<Admin> findAll() {
		List<Admin> admins = new ArrayList<Admin>();
		String sql = "select * from admin";
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id =  rs.getInt("admin_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				Admin admin = new Admin(id, name, email,  password);
				admins.add(admin);
			}
			return admins;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addAdmin(Admin admin) {

		String query = "insert into admin values(?,?,?,?)";

		try {
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, admin.getAdmin_id());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getEmail());
			ps.setString(4, admin.getPassword());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Admin getAdminById(int id) {
		String query = "select * from admin where admin_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				int id1 =  rs.getInt("admin_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				String password = rs.getString("password");
				Admin admin = new Admin(id1, name, email,  password);
			return admin;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteAdmin(int id) {
		String query = "delete from admin where admin_id = ?";
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
	public boolean updateAdmin(Admin admin) {
		String query = "update admin set admin_id =?,name = ?,email=?,password=? where admin_id = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, admin.getAdmin_id());
			ps.setString(2, admin.getName());
			ps.setString(3, admin.getEmail());
			ps.setString(4, admin.getPassword());
			ps.setInt(5, admin.getAdmin_id()); 
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
