package com.amdocs.training.model;

public class Contact {
	private long user_id;
	private String name;
	private String email;
	private long phone_no;
	private String message;
	private int contact_id;
	
	public Contact() {
		super();
	}

	public Contact(long user_id, String name, String email, long phone_no, String message, int contact_id) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
		this.message = message;
		this.contact_id = contact_id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getContact_id() {
		return contact_id;
	}

	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}

	@Override
	public String toString() {
		return "contact [user_id=" + user_id + ", name=" + name + ", email=" + email + ", phone_no=" + phone_no
				+ ", message=" + message + ", contact_id=" + contact_id + "]";
	}


}
