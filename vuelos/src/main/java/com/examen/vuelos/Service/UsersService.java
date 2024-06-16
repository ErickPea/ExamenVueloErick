package com.examen.vuelos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.vuelos.Entity.Users;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IRepository.UsersIRepository;
import com.examen.vuelos.IService.UsersIService;
@Service

public class UsersService extends ABaseService<Users> implements UsersIService{
@Autowired
private UsersIRepository repository;
	@Override
	protected IBaseRepository<Users, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}
	
	

}
