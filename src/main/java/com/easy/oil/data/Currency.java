package com.easy.oil.data;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Currency  implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String type;
	private double usd_value;
	
	public Currency() {
		super();
	}

	public Currency(int id, String name, String type, double usd_value) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.usd_value = usd_value;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getUsd_value() {
		return usd_value;
	}

	public void setUsd_value(double usd_value) {
		this.usd_value = usd_value;
	}
}
