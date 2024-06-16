package com.examen.vuelos.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.examen.vuelos.Entity.Airports;
import com.examen.vuelos.IRepository.AirportsIRepository;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IService.AirportsIService;
@Service
public class AirportsService extends ABaseService<Airports> implements AirportsIService{
@Autowired
private AirportsIRepository repository;
	@Override
	protected IBaseRepository<Airports, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	

}
