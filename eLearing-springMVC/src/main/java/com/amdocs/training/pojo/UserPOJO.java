package com.amdocs.training.pojo;

public class UserPOJO {
	private int id;
	private String password;
	public UserPOJO() {
		super();
	}
	public UserPOJO(int id, String password) {
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
		return "UserPOJO [id=" + id + ", password=" + password + "]";
	}
	
}
