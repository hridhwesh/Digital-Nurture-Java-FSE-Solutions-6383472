package com.cognizant.orm_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);

        LOGGER.info("Inside main");
        
        //testGetAllCountries();
//        getCountryTest();
//        testAddCountry();
//        testUpdateCountry();
//        testDeleteCountry();
        testFindCountriesByPartialName();
        testFindCountriesByPartialNameSorted();
        testFindCountriesByStartingLetter();


    }
    private static void getCountryTest() {
        LOGGER.info("Start");
        try {
            Country country = countryService.findCountryByCode("IN");
            LOGGER.debug("Country: {}", country);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Exception: {}", e.getMessage());
        }
        LOGGER.info("End");
    }
    private static void testAddCountry() {
        LOGGER.info("Start");
        Country country = new Country();
        country.setCode("UT"); 
        country.setName("United Test");

        countryService.addCountry(country);

        try {
            Country retrievedCountry = countryService.findCountryByCode("UT");
            LOGGER.debug("Retrieved Country: {}", retrievedCountry);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Country not found after insert: {}", e.getMessage());
        }

        LOGGER.info("End");
    }
    private static void testUpdateCountry() {
        LOGGER.info("Start");

        try {
            
            countryService.updateCountry("IN", "Republic of India");

            Country updatedCountry = countryService.findCountryByCode("IN");
            LOGGER.debug("Updated Country: {}", updatedCountry);
        } catch (CountryNotFoundException e) {
            LOGGER.error("Country not found: {}", e.getMessage());
        }

        LOGGER.info("End");
    }


    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");
    }
    private static void testDeleteCountry() {
        LOGGER.info("Start");

        countryService.deleteCountry("UT");

        try {
            countryService.findCountryByCode("UT");
        } catch (CountryNotFoundException e) {
            LOGGER.debug("Country successfully deleted: {}", e.getMessage());
        }

        LOGGER.info("End");
    }
    private static void testFindCountriesByPartialName() {
        LOGGER.info("Start - testFindCountriesByPartialName");
        List<Country> countries = countryService.findCountriesByPartialName("ou");
        LOGGER.debug("Countries with 'ou' in name: {}", countries);
        LOGGER.info("End");
    }

    private static void testFindCountriesByPartialNameSorted() {
        LOGGER.info("Start - testFindCountriesByPartialNameSorted");
        List<Country> countries = countryService.findCountriesByPartialNameSorted("ou");
        LOGGER.debug("Countries with 'ou' in name (sorted): {}", countries);
        LOGGER.info("End");
    }

    private static void testFindCountriesByStartingLetter() {
        LOGGER.info("Start - testFindCountriesByStartingLetter");
        List<Country> countries = countryService.findCountriesByStartingLetter("Z");
        LOGGER.debug("Countries starting with 'Z': {}", countries);
        LOGGER.info("End");
    }

}
