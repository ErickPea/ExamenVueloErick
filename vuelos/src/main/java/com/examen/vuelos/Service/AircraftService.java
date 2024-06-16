package com.examen.vuelos.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.examen.vuelos.Entity.Aircraft;
import com.examen.vuelos.IRepository.AircraftsIRepository;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IService.AircraftIService;
@Service
public class AircraftService  extends ABaseService<Aircraft> implements AircraftIService {

	@Autowired
	private AircraftsIRepository repository;
	
	@Override
	protected IBaseRepository<Aircraft, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

}
