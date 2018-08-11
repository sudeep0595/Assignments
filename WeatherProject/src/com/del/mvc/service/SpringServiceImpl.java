package com.del.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.del.mvc.bean.City;
import com.del.mvc.bean.Country;
import com.del.mvc.bean.WeatherUser;
import com.del.mvc.dao.ServiceDaoImpl;
import com.del.mvc.dao.SpringDao;

@Service("sService")
public class SpringServiceImpl implements SpringService {
	
	@Autowired
	private SpringDao sDao;
	

	public SpringServiceImpl() {

		sDao=new ServiceDaoImpl();
	}


	@Override
	public boolean verifyLogin(WeatherUser wuser) {
		
		return sDao.verifyLogin(wuser);
	}


	@Override
	public boolean createUser(WeatherUser wuser) {
		
		return sDao.createUser(wuser);
	}


	@Override
	public boolean findLogin(String login) {
		
		return sDao.findLogin(login);
	}





	@Override
	public List<Country> getAllCountries() {
		
		return sDao.getAllCountries();
	}


	@Override
	public List<City> getAllCity(int co_id) {
		
		return sDao.getAllCity(co_id);
	}


	@Override
	public City getWeather(int ci_id) {
		
		return sDao.getWeather(ci_id);
	}


	@Override
	public Country getCountry(int coci_id) {
		
		return sDao.getCountry(coci_id);
	}


	@Override
	public List<City> searchCityByWeather(String weather) {
	
		return sDao.searchCityByWeather(weather);
	}

}
