package com.amdocs.training.dao;
import java.util.List;
import com.amdocs.training.model.Contact;
public interface ContactDAO {


	List<Contact> findAll();

	boolean addContact(Contact contact);

	Contact getContactById(int id);

	boolean deleteContact(int id);

	boolean updateContact(Contact conctact);
}

