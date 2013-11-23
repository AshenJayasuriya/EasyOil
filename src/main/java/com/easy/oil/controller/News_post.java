package com.easy.oil.controller;

public class News_post {
	private String title;
	private String body;
	private String price;
	private String user_id;
	
	public News_post(String user_id){
		this.user_id = user_id;
	}
	
	public News_post(){
		
	}
	
	public String getId(){
		return user_id;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setBody(String body){
		this.body = body;
	}
	

	public void setPrice(String price){
		this.price = price;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getBody(){
		return body;
	}
	
	
	public String getPrice(){
		return price;
	}
}
