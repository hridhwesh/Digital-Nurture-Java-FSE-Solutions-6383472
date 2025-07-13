package com.cognizant.spring_learn.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.service.CountryService;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

@RestController
public class CountryController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/country")
	public Country getCountryIndia() {
		LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("in", Country.class);
        LOGGER.debug("Country: {}", country);
        LOGGER.info("END");
		((ClassPathXmlApplicationContext) context).close();
        return country;
        
	}
	
	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		 LOGGER.info("START");

		    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		    @SuppressWarnings("unchecked")
		    List<Country> countryList = (List<Country>) context.getBean("countryList");

		    LOGGER.debug("Country List : {}", countryList);
		    LOGGER.info("END");
			((ClassPathXmlApplicationContext) context).close();
			return countryList;
	}
	
	@GetMapping("/countries/{code}")
	public Country getCountry(@PathVariable String code) throws CountryNotFoundException {
		LOGGER.info("START");
		Country country = CountryService.getCountry(code);
		LOGGER.debug("Country: {}",country);
		LOGGER.info("END");
		return country;
	}
}
