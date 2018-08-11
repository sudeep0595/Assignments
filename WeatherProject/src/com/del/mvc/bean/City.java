package com.del.mvc.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="city")
public class City {
	@Id
	private int ci_id;
	private String ci_name;
	private int coci_id;
	private int temp;
	private int humidity;
	private String weather;
	
	public City() {
		
	}
	public City(int ci_id, String ci_name, int coci_id, int temp, int humidity, String weather) {
		super();
		this.ci_id = ci_id;
		this.ci_name = ci_name;
		this.coci_id = coci_id;
		this.temp = temp;
		this.humidity = humidity;
		this.weather = weather;
	}
	
	public int getCi_id() {
		return ci_id;
	}
	public void setCi_id(int ci_id) {
		this.ci_id = ci_id;
	}
	public String getCi_name() {
		return ci_name;
	}
	public void setCi_name(String ci_name) {
		this.ci_name = ci_name;
	}
	public int getCoci_id() {
		return coci_id;
	}
	public void setCoci_id(int coci_id) {
		this.coci_id = coci_id;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
	public int getHumidity() {
		return humidity;
	}
	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	@Override
	public String toString() {
		return "City [ci_id=" + ci_id + ", ci_name=" + ci_name + ", coci_id=" + coci_id + ", temp=" + temp
				+ ", humidity=" + humidity + ", weather=" + weather + "]";
	}

	

}
