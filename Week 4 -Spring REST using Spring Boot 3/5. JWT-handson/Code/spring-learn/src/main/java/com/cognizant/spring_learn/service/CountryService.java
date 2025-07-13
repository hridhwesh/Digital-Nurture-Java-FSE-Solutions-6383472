package com.cognizant.spring_learn.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.spring_learn.Country;
import com.cognizant.spring_learn.SpringLearnApplication;
import com.cognizant.spring_learn.service.exception.CountryNotFoundException;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CountryService {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	
	@Transactional
	public static Country getCountry(String code) throws CountryNotFoundException {
	    LOGGER.info("START");

	    try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml")) {
	        @SuppressWarnings("unchecked")
	        List<Country> countryList = (List<Country>) context.getBean("countryList");

	        Country country = countryList.stream()
	            .filter(c -> c.getCode().equalsIgnoreCase(code))
	            .findFirst()
	            .orElseThrow(() -> new CountryNotFoundException("Country not found with code: " + code));

	        LOGGER.debug("Country : {}", country);
	        LOGGER.info("END");

	        return country;
	    }
	}

}
