package com.del.mvc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.del.mvc.bean.City;
import com.del.mvc.bean.Country;
import com.del.mvc.bean.WeatherUser;
import com.del.mvc.service.SpringService;
import com.del.mvc.service.SpringServiceImpl;

@Controller
public class MyController {

	@Autowired
	private SpringService sService;

	public MyController() {
		sService = new SpringServiceImpl();
	}
	
	@RequestMapping(value="/index")
	public String welcomePage(Model model) {
		WeatherUser wuser = new WeatherUser();
		model.addAttribute("wuser", wuser);
		return "index";
	}

	@RequestMapping(value = "/showForm")
	public String showForm(Model model) {
		System.out.println("show form");
		WeatherUser wuser = new WeatherUser();
		model.addAttribute("wuser", wuser);
		return "login";
	}

	@RequestMapping(value = "/checkLogin")
	public String checkLogin(@ModelAttribute(value = "wuser") WeatherUser wuser, Model model) {
		System.out.println("checkin login");
		System.out.println(wuser);
		// code with service/dao/jpa
		boolean success = sService.verifyLogin(wuser);
		if (success) {
			return "display";
		} else {
			return "error1";
		}

	}
	

	@RequestMapping(value = "/register")
	public String register(Model model) {
		System.out.println("Registering new user");
		WeatherUser wuser = new WeatherUser();
		model.addAttribute("wuser", wuser);
		return "register";
	}

	@RequestMapping(value = "/newUser")
	public String newUser(@ModelAttribute(value = "wuser") WeatherUser wuser, Model model) {
		System.out.println("creating new user");
		System.out.println(wuser);
		// code with service/dao/jpa
		boolean success = sService.createUser(wuser);
		if(success) {
		return 	"regsuccesful";
		}
		else {
		return	"error2";
		}
		
	}
	
	@RequestMapping(value = "/regsuccesful")
	public String regSuccess() {
		System.out.println("registration successfull");
		return "regsuccesful";	
	}
	
	@RequestMapping(value="/weatherform")
	public String weatherpage(Model model) {
		List<Country> countryList= sService.getAllCountries();
		System.out.println(countryList);
	    model.addAttribute("countryList",countryList);
	    model.addAttribute("country",new Country());
		System.out.println("Weather Details Page");
		return "weatherform";
	}
	
	@RequestMapping(value="/selectCity")
	public String fetchCity(@ModelAttribute(value ="country")Country country,Model model) {
		System.out.println("fetching city");
		System.out.println(country);
		List<City> cityList= sService.getAllCity(country.getCo_id());
		System.out.println(cityList);
		model.addAttribute("city",new City());
		model.addAttribute("cityList",cityList);
		return "selectCity"	;
		
	}
	

	@RequestMapping(value="/displayWeather")
	public String fetch(@ModelAttribute(value ="city")City city,Model model) {
		System.out.println("fetching weather details");
		System.out.println(city);
		City city1= sService.getWeather(city.getCi_id());
		Country country=sService.getCountry(city1.getCoci_id());
		System.out.println(city1);
		model.addAttribute("city1",city1);
		model.addAttribute("country",country);
		return "displayWeather"	;
		
	}
	
	@RequestMapping(value="/weatherchoice")
	public String searchByWeather(Model model){
		model.addAttribute("city",new City());
		System.out.println("Weather Choice Page");
		return "weatherchoice";
	}
	
	@RequestMapping(value="/checkWeather")
	public String searchCityByWeather(@ModelAttribute(value ="city")City city,Model model){
		System.out.println("fetching weather details");
		System.out.println(city);
		List<City> cityList= sService.searchCityByWeather(city.getWeather());
		System.out.println(cityList);
		model.addAttribute("cityList",cityList);
		return "checkWeather";
	}
	

}
