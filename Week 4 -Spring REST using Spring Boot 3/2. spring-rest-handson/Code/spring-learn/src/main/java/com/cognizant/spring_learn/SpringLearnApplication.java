package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class SpringLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
    
    
	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("[LOG]Inside main.");
		//displayDate();
		//displayCountry();
		//displayCountries();
	}
	public static void displayDate() {
	    LOGGER.info("START");

	    ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

	    SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

	    try {
	        Date date = format.parse("31/12/2018");
	        LOGGER.debug("Date: {}", date);
	    } catch (ParseException e) {
	        LOGGER.error("Error parsing date", e);
	    }

	    LOGGER.info("END");
		((ClassPathXmlApplicationContext) context).close();
    }
	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		LOGGER.debug("Country : {}", country.toString());
		
		((ClassPathXmlApplicationContext) context).close();

	}
	public static void displayCountries() {
	    LOGGER.info("START");

	    ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

	    @SuppressWarnings("unchecked")
	    List<Country> countryList = (List<Country>) context.getBean("countryList");

	    LOGGER.debug("Country List : {}", countryList);

	    LOGGER.info("END");
		((ClassPathXmlApplicationContext) context).close();

	}

}
