package com.revature.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="USER_TABLE")
public class User {
	/*-----------------------------------
	 * Variables
	 * 
	 * ---------------------------------*/
	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASS_WORD")
	private String password;
	
	@Column(name="IS_ADMIN")
	private boolean admin;
	
	/*-------------------------------------
	 * GETTERS AND SETTERS
	 * 
	 * ----------------------------------*/
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	/*------------------------------------------
	 * Constructors
	 * 
	 * ----------------------------------------*/
	public User(int id, String username, String password, boolean admin) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.admin = admin;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String username, String password, boolean admin) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
		this.admin = admin;
	}

	/*-------------------------------------
	 * To String method
	 * 
	 * -----------------------------------*/
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", admin=" + admin + "]";
	}
	
	

}
