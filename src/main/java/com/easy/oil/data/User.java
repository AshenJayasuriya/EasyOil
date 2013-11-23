package com.easy.oil.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_id;
	public String first_name;
	public String last_name;
	public String username;
	public String e_mail;
	public String password;
	public boolean admin;
	public String currency;
	public User(String first_name, String last_name ,String e_mail , String password, boolean admin, String currency) {
		//super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.e_mail = e_mail;
		this.password = password;
		this.admin = admin;
		this.currency = currency;
	}

	public User() {

	}
	
	public long getId() {
		return user_id;
	}

	public String getFirstName() {
		return first_name;
	}

	public void setFirstName(String f_name) {
		this.first_name = f_name;
	}
	
	public String getLastName() {
		return last_name;
	}

	public void setLastName(String l_name) {
		this.last_name = l_name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return e_mail;
	}

	public void setEmail(String e_mail) {
		this.e_mail = e_mail;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean getAdmin() {
		return admin;
	}

	public void setAdmmin(boolean admin) {
		this.admin = admin;
	}
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "User [id=" + user_id + ", first_name=" + first_name + ", last_name="
				+ last_name + ", username=" + username + ", e_mail=" + e_mail
				+ ", password=" + password + ", admin=" + admin + ", currency="
				+ currency + "]";
	}



}
