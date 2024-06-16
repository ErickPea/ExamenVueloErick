package com.examen.vuelos.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examen.vuelos.Entity.ABaseEntity;

@Repository
public interface IBaseRepository <T extends ABaseEntity, ID> extends JpaRepository<T, Long>{
	
	
}

