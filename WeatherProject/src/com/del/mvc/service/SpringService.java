package com.del.mvc.service;


import java.util.List;

import com.del.mvc.bean.City;
import com.del.mvc.bean.Country;
import com.del.mvc.bean.WeatherUser;

public interface SpringService {

	boolean verifyLogin(WeatherUser login);

	boolean createUser(WeatherUser wuser);

	boolean findLogin(String login);


	List<Country> getAllCountries();

	List<City> getAllCity(int i);

	City getWeather(int ci_id);

	Country getCountry(int coci_id);

	List<City> searchCityByWeather(String weather);

}
