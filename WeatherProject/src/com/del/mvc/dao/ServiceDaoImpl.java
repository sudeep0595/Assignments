package com.del.mvc.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.del.mvc.bean.City;
import com.del.mvc.bean.Country;
import com.del.mvc.bean.WeatherUser;
import com.del.mvc.util.JPAUtil;

@Repository("sDao")
public class ServiceDaoImpl implements SpringDao {

	@Override
	public boolean verifyLogin(WeatherUser wuser) {
		boolean success=false;
		EntityManager em= JPAUtil.getEntityManager();
		WeatherUser wuser1=em.find(WeatherUser.class,wuser.getLogin());
		if(wuser1!=null) {
		if(wuser.getLogin().equals(wuser1.getLogin()) && wuser.getPassword().equals(wuser1.getPassword())) {
			success=true;
		}
		}
		return success;
	}

	@Override
	public boolean createUser(WeatherUser wuser) {
		boolean success=false;
		try {
			EntityManager em=JPAUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(wuser);
			em.getTransaction().commit();
			em.detach(wuser);
			success=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return success;
	}

	@Override
	public boolean findLogin(String login) {
		boolean success=false;
		EntityManager em= JPAUtil.getEntityManager();
		String login1=em.find(String.class,login);
		if(login1!=null) {
			if(login1.equals(login)) {
				success=true;
			}
			}	
		return success;
	}


	@Override
	public List<Country> getAllCountries() {
		List<Country> countryList=null;
		EntityManager em= JPAUtil.getEntityManager();
		Query q = em.createQuery("Select country from Country country");
		countryList=q.getResultList();;
		return countryList;
	}

	@Override
	public List<City> getAllCity(int co_id) {
		EntityManager em= JPAUtil.getEntityManager();
		String q ="Select city from City city where city.coci_id=:pco_id";
		TypedQuery<City> query= em.createQuery(q,City.class);
		query.setParameter("pco_id", co_id);
		List<City> cityList= query.getResultList();
		return cityList;
	}

	@Override
	public City getWeather(int ci_id) {
		EntityManager em= JPAUtil.getEntityManager();
		City c1=em.find(City.class,ci_id);
		return c1;
	}

	@Override
	public Country getCountry(int coci_id) {
		EntityManager em= JPAUtil.getEntityManager();
		Country con=em.find(Country.class,coci_id);
		return con;
	}

	@Override
	public List<City> searchCityByWeather(String weather) {
		EntityManager em= JPAUtil.getEntityManager();
		String q ="Select city from City city where city.weather=:pweather";
		TypedQuery<City> query= em.createQuery(q,City.class);
		query.setParameter("pweather", weather);
		List<City> cityList= query.getResultList();
		return cityList;
	}

}
