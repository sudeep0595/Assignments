package com.del.mvc.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	
	@Id
	private int co_id;
	private String co_name;
	public int getCo_id() {
		return co_id;
	}
	public void setCo_id(int co_id) {
		this.co_id = co_id;
	}
	public String getCo_name() {
		return co_name;
	}
	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}
	public Country(int co_id, String co_name) {
		this.co_id = co_id;
		this.co_name = co_name;
	}
	public Country() {
	
	}
	@Override
	public String toString() {
		return "Country [co_id=" + co_id + ", co_name=" + co_name + "]";
	}
	
	

}
