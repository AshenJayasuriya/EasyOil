package com.easy.oil.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.codec.digest.DigestUtils;

@Entity
@Table(name = "StdUser")
public class StdUser implements Serializable {
	
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_id;
	private String first_name;
	private String last_name;
	private String username;
	private String e_mail;
	private String password;
	private boolean administrator;
	private int currency;
	private boolean authorized;
	
	
	
	
	public StdUser() {
		super();
	}

	public StdUser(String first_name, String last_name, String username,
			String e_mail, String password, boolean administrator,
			int currency, boolean authorized) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.username = username;
		this.e_mail = e_mail;
		this.password = password;
		this.administrator = administrator;
		this.currency = currency;
		this.authorized = authorized;
	}

	public String getFirst_name() {
		return first_name;
	}
	
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getE_mail() {
		return e_mail;
	}
	
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isAdministrator() {
		return administrator;
	}
	
	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}
	
	public int getCurrency() {
		return currency;
	}
	
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	
	public boolean isAuthorized() {
		return authorized;
	}
	
	public void setAuthorized(boolean authorized) {
		this.authorized = authorized;
	}
	
	public long getUser_id() {
		return user_id;
	}
	
	@Override
	public String toString() {
		return "StdUser [user_id=" + user_id + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", username=" + username
				+ ", e_mail=" + e_mail + ", password=" + password
				+ ", administrator=" + administrator + ", currency=" + currency
				+ ", authorized=" + authorized + "]";
	}	
	
}