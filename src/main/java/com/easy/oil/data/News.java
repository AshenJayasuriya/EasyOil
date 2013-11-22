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
	private String user_id;
	private String headline;
	private String content;
	private double cost;
	private String date;
	
	public News(String user_id,String headline,String content,double cost,String date){
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
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
