package com.atech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atech.model.Flight;

public interface FlightRepository extends JpaRepository<Flight,Long>{

}
