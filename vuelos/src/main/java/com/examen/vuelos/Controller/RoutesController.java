package com.examen.vuelos.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examen.vuelos.Entity.Routes;
import com.examen.vuelos.IService.RoutesIService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Routes")
public class RoutesController extends ABaseController<Routes, RoutesIService>{

	public RoutesController(RoutesIService service) {
		super(service, "Routes");
		// TODO Auto-generated constructor stub
	}

}
