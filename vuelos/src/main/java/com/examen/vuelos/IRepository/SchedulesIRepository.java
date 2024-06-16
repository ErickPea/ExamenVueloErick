package com.examen.vuelos.IRepository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.vuelos.Entity.Schedules;
@Repository
public interface SchedulesIRepository extends IBaseRepository<Schedules, Long>{
	
	/*
	    List<Schedules> findByOrigin(String origin);
	    List<Schedules> findByDestination(String destination);
	    List<Schedules> findByOriginAndDestination(String origin, String destination);
	    List<Schedules> findByDepartureDateBetweenAndReturnDateBetween(LocalDate departureStart);
	}*/
}
