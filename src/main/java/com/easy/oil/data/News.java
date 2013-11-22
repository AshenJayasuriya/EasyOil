package com.easy.oil.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class News {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	public String user_id;
	public String headline;
	public String content;
	public String cost;
	public String date;
	
	public News(String user_id,String headline,String content,String cost,String date){
		super();
		this.user_id =  user_id;
		this.headline = headline;
		this.content = content;
		this.cost = cost;
		this.date = date;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "News [user_id=" + user_id + ", headline=" + headline
				+ ", content=" + content + ", cost=" + cost + ", date=" + date
				+ "]";
	}
	
	
	

}
