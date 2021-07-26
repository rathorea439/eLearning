package com.amdocs.training.dao;

import java.util.List;

import com.amdocs.training.model.Admin;

public interface AdminDAO {
	List<Admin> findAll();

	boolean addAdmin(Admin admin);

	Admin getAdminById(int id);

	boolean deleteAdmin(int id);
	
	boolean updateAdmin(Admin admin);

}
