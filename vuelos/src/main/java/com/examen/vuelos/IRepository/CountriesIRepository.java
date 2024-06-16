package com.examen.vuelos.IRepository;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.examen.vuelos.Entity.Country;
@Repository
public interface CountriesIRepository extends IBaseRepository<Country, Long>{

	@Query(value="SELECT" 
	+"c.id"
			+"c.name"
	+
	"from"+"Country c", nativeQuery=true)
	List<Country> getlist();
	
}
