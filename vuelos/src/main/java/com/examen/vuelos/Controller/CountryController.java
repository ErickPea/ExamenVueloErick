package com.examen.vuelos.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examen.vuelos.Entity.Country;
import com.examen.vuelos.IService.CountryIService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/country")
public class CountryController extends ABaseController<Country, CountryIService>{

	public CountryController(CountryIService service) {
		super(service, "Country");
		// TODO Auto-generated constructor stub
	}

}
