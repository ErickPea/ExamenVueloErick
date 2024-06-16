package com.examen.vuelos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.vuelos.Entity.Role;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IRepository.RolesIRepository;
import com.examen.vuelos.IService.RoleIService;
@Service
public class RoleService extends ABaseService<Role> implements RoleIService{
@Autowired
private RolesIRepository repository;
	@Override
	protected IBaseRepository<Role, Long> getRepository() {
		// TODO Auto-generated method stub
		return repository;
	}

	
	
}
