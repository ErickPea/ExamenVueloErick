package com.examen.vuelos.IRepository;

import org.springframework.stereotype.Repository;
import com.examen.vuelos.Entity.Airports;

@Repository
public interface AirportsIRepository extends IBaseRepository<Airports, Long>{
	 /*Airports findByIATACode(String IATACode);*/
}
