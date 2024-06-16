package com.examen.vuelos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.vuelos.Entity.Schedules;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IRepository.SchedulesIRepository;
import com.examen.vuelos.IService.SchedulesIService;
@Service
public class SchedulesService extends ABaseService<Schedules> implements SchedulesIService{

	@Autowired
	private SchedulesIRepository repository;
	@Override
	protected IBaseRepository<Schedules, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	

}
