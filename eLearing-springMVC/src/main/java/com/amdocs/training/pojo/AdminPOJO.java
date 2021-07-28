package com.amdocs.training.pojo;

public class AdminPOJO {
	private int id;
	private String password;
	
	public AdminPOJO() {
		super();
	}
	public AdminPOJO(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminPOJO [id=" + id + ", password=" + password + "]";
	}
	

}
