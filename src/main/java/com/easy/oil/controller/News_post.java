package com.easy.oil.controller;

public class News_post {
	private String title;
	private String body;
	private String author;
	private String price;
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public void setBody(String body){
		this.body = body;
	}
	
	public void setName(String name){
		this.author = name;
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
	
	public String getName(){
		return author;
	}
	
	public String getPrice(){
		return price;
	}
}
