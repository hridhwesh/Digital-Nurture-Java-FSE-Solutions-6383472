package com.cognizant.orm_learn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.orm_learn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByNameContaining(String partialName);

    List<Country> findByNameContainingOrderByNameAsc(String partialName);

    List<Country> findByNameStartingWith(String startingLetter);
}
