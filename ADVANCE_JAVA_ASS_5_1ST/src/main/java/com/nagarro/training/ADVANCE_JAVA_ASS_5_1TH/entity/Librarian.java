package com.nagarro.training.ADVANCE_JAVA_ASS_5_1TH.entity;

public class Librarian {
	
	private int id;
	private String username;
	private String email;
	private String password;

	public Librarian() {
		super();
	}

	public Librarian(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getpassword() {
		return password;
	}

	public void setpassword(String password) {
		this.password = password;
	}
}
