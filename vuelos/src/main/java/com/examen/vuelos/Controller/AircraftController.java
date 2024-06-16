package com.examen.vuelos.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examen.vuelos.Entity.Aircraft;
import com.examen.vuelos.IService.AircraftIService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Aircraft")
public class AircraftController extends ABaseController<Aircraft, AircraftIService> {

	public AircraftController(AircraftIService service) {
		super(service, "Aircraft");
		// TODO Auto-generated constructor stub
	}

}
