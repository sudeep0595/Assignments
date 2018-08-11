package com.del.mvc.dao;


import java.util.List;

import com.del.mvc.bean.City;
import com.del.mvc.bean.Country;
import com.del.mvc.bean.WeatherUser;

public interface SpringDao {

	boolean verifyLogin(WeatherUser wuser);

	boolean createUser(WeatherUser wuser);

	boolean findLogin(String login);


	List<Country> getAllCountries();

	List<City> getAllCity(int co_id);

	City getWeather(int ci_id);

	Country getCountry(int coci_id);

	List<City> searchCityByWeather(String weather);

}
