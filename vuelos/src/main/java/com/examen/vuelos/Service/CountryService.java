package com.examen.vuelos.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.vuelos.Entity.Country;
import com.examen.vuelos.IRepository.CountriesIRepository;
import com.examen.vuelos.IRepository.IBaseRepository;
import com.examen.vuelos.IService.CountryIService;
@Service 

public class CountryService extends ABaseService<Country> implements CountryIService{

	@Autowired
	private CountriesIRepository respository ;
	@Override
	protected IBaseRepository<Country, Long> getRepository() {
		// TODO Auto-generated method stub
		return respository;
	}

}
