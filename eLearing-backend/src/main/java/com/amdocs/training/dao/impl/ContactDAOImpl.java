package com.amdocs.training.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.amdocs.training.dao.ContactDAO;
import com.amdocs.training.model.Contact;
import com.amdocs.training.DBUtil;

public class ContactDAOImpl implements ContactDAO {
	DataSource dataSource = DBUtil.dataSource();
	
	@Override
	public List<Contact> findAll() {
		List<Contact> contacts = new ArrayList<Contact>();
		String sql = "select * from contact";
		try {
			Connection conn = dataSource.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Long user_id = (long) rs.getInt("user_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Long phone_no=rs.getLong("phone_no");
				String msg = rs.getString("Messege");
				int contact_id = rs.getInt("contact_id");
				Contact contact = new Contact(user_id, name, email,phone_no, msg, contact_id);
				contacts.add(contact);
			}
			return contacts;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean addContact(Contact contact) {

		String query = "insert into contact values(?,?,?,?,?,?)";

		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);

			ps.setLong(1, contact.getUser_id());
			ps.setString(2, contact.getName());
			ps.setString(3, contact.getEmail());
			ps.setLong(4, contact.getPhone_no());
			ps.setString(5, contact.getMessage());
			ps.setInt(6, contact.getContact_id());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

	@Override
	public Contact getContactById(int id) {
		String query = "select * from contact where contact_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				Long user_id = (long) rs.getInt("user_id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Long phone_no=rs.getLong("phone_no");
				String msg = rs.getString("Messege");
				int contact_id = rs.getInt("contact_id");
				Contact contact = new Contact(user_id, name, email,phone_no, msg, contact_id);
			return contact;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean deleteContact(int id) {
		String query = "delete from contact where contact_id = ?";
		try {
			Connection conn = dataSource.getConnection();
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
	public boolean updateContact(Contact contact) {
		String query = "update contact set user_id =?,name = ?,email=?,phone_no=?,Messege=?,contact_id=? where contact_id = ?";
		try {
			Connection conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setLong(1, contact.getUser_id());
			ps.setString(2, contact.getName());
			ps.setString(3, contact.getEmail());
			ps.setLong(4, contact.getPhone_no());
			ps.setString(5, contact.getMessage());
			ps.setInt(6, contact.getContact_id());
			ps.setLong(7, contact.getContact_id()); 
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
