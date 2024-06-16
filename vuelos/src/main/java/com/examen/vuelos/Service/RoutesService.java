package com.examen.vuelos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.vuelos.Entity.Routes;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IRepository.RoutesIRepository;
import com.examen.vuelos.IService.RoutesIService;
@Service
public class RoutesService extends ABaseService<Routes> implements RoutesIService{
@Autowired
private RoutesIRepository repository;
	@Override
	protected IBaseRepository<Routes, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	

}
