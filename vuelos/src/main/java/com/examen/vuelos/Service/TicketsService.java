package com.examen.vuelos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.vuelos.Entity.Tickets;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IRepository.TicketsIRepository;
import com.examen.vuelos.IService.TicketsIService;
@Service
public class TicketsService extends ABaseService<Tickets> implements TicketsIService{

	@Autowired
	private TicketsIRepository repository;
	@Override
	protected IBaseRepository<Tickets, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	

}
