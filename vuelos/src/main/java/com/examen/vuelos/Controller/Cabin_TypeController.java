package com.examen.vuelos.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.vuelos.Entity.Cabin_Type;
import com.examen.vuelos.IService.Cabin_TypeIService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Cabin_Type")
public class Cabin_TypeController extends ABaseController<Cabin_Type, Cabin_TypeIService>{

	public Cabin_TypeController(Cabin_TypeIService service) {
		super(service, "Cabin_Type");
		// TODO Auto-generated constructor stub
	}
	

}
