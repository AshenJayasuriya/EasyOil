package com.easy.oil.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "StdUser")
public class StdUser implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long user_id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="username")
	private String username;
	@Column(name="e_mail")
	private String e_mail;
	@Column(name="password")
	private String password;
	@Column(name="administrator")
	private boolean administrator;
	@Column(name="currency")
	private String currency;
	
        
        public StdUser(String first_name, String last_name ,String e_mail , String password, boolean administrator, String currency) {
		//super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.e_mail = e_mail;
		this.password = password;
		this.administrator = administrator;
		this.currency = currency;
	}

	public StdUser() {

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
		return administrator;
	}

	public void setAdmmin(boolean administrator) {
		this.administrator = administrator;
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
				+ ", password=" + password + ", admin=" + administrator + ", currency="
				+ currency + "]";
	}



}