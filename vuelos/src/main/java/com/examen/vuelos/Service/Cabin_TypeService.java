package com.examen.vuelos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.vuelos.Entity.Cabin_Type;
import com.examen.vuelos.IRepository.Cabin_TypesIRepository;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IService.Cabin_TypeIService;

@Service
public class Cabin_TypeService extends ABaseService<Cabin_Type> implements Cabin_TypeIService {
 @Autowired
private Cabin_TypesIRepository repository;
	@Override
	protected IBaseRepository<Cabin_Type, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	

}
