package com.del.mvc.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="weather_user")
public class WeatherUser {
	
	@Id
	private String login;
	private String password;
	private String name;
	
	public WeatherUser(String login, String password, String name) {
		this.login = login;
		this.password = password;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WeatherUser() {
	
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "WeatherUser [login=" + login + ", password=*********" + ", name=" + name + "]";
	}
	

}
