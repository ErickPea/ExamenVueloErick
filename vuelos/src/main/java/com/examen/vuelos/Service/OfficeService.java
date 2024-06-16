package com.examen.vuelos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.vuelos.Entity.Office;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IRepository.OfficesIRepository;
import com.examen.vuelos.IService.OfficeIService;
@Service
public class OfficeService extends ABaseService<Office>implements OfficeIService{

	@Autowired
	private OfficesIRepository repository;
	@Override
	protected IBaseRepository<Office, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	

}
