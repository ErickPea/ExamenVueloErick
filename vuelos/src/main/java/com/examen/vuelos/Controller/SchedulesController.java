package com.examen.vuelos.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examen.vuelos.Entity.Schedules;
import com.examen.vuelos.IService.SchedulesIService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Schedules")
public class SchedulesController extends ABaseController<Schedules, SchedulesIService>{

	public SchedulesController(SchedulesIService service) {
		super(service, "Schedules");
		// TODO Auto-generated constructor stub
	}
	
	

}
