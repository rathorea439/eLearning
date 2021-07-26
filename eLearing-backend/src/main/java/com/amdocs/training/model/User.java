package com.amdocs.training.model;

public class User {
	private Long id;
	private String username;
	private Long phone_no;  
	private String password;
	private String email;
	private String address;

	public User() {
		super();
	}

	public User(long id, String username, Long phone_no, String password, String email, String address) {
		super();
		this.id = id;
		this.username = username;
		this.phone_no = phone_no;
		this.password = password;
		this.email = email;
		this.address = address;
	}

	public Long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", phone_no=" + phone_no + ", password=" + password
				+ ", email=" + email + ", address=" + address + "]";
	}

	
}