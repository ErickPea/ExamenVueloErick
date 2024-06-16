package com.examen.vuelos.IRepository;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.vuelos.Entity.Cabin_Type;
@Repository
public interface Cabin_TypesIRepository extends IBaseRepository<Cabin_Type, Long>{
	 //List<Cabin_Type> findByGenre(String genre);
}
