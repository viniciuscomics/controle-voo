package com.atech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atech.model.City;

public interface CityRepository extends JpaRepository<City, Long>{

}
