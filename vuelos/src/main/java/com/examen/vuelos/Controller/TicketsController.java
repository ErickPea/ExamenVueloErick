package com.examen.vuelos.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examen.vuelos.Entity.Tickets;
import com.examen.vuelos.IService.TicketsIService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Tickets")
public class TicketsController extends ABaseController<Tickets, TicketsIService>{

	public TicketsController(TicketsIService service) {
		super(service, "Tickets");
		// TODO Auto-generated constructor stub
	}

}
