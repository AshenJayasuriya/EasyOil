package com.easy.oil.data;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class News implements Serializable {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String user_id;
	private String headline;
	private String content;
	private String cost;
	private Timestamp timestmp;
	
	public News(String user_id,String headline,String content,String cost,Timestamp timestmp){
		super();
		this.user_id =  user_id;
		this.headline = headline;
		this.content = content;
		this.cost = cost;
		this.timestmp = timestmp;
	}
	
	public News(){
		
	}

	public long getId() {
		return id;
	}
	
	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public Timestamp getDate() {
		return timestmp;
	}

	public void setDate(Timestamp timestmp) {
		this.timestmp = timestmp;
	}

	@Override
	public String toString() {
		return "News [user_id=" + user_id + ", headline=" + headline
				+ ", content=" + content + ", cost=" + cost + ", timestamp=" + timestmp
				+ "]";
	}
	
	
	

}
