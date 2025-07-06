package com.cognizant.orm_learn.service;

import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.repository.CountryRepository;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
    
    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(countryCode);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found with code: " + countryCode);
        }
        return result.get();
    }
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }
    @Transactional
    public void updateCountry(String code, String name) throws CountryNotFoundException {
        Optional<Country> result = countryRepository.findById(code);
        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found with code: " + code);
        }
        Country country = result.get();
        country.setName(name);
        countryRepository.save(country);
    }
    @Transactional
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }
    @Transactional(readOnly = true)
    public List<Country> findCountriesByPartialName(String partialName) {
        return countryRepository.findByNameContaining(partialName);
    }

    @Transactional(readOnly = true)
    public List<Country> findCountriesByPartialNameSorted(String partialName) {
        return countryRepository.findByNameContainingOrderByNameAsc(partialName);
    }

    @Transactional(readOnly = true)
    public List<Country> findCountriesByStartingLetter(String letter) {
        return countryRepository.findByNameStartingWith(letter);
    }


}
