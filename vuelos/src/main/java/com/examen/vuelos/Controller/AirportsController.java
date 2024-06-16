package com.examen.vuelos.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examen.vuelos.Entity.Airports;
import com.examen.vuelos.IRepository.AirportsIRepository;
import com.examen.vuelos.IService.AirportsIService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/airports")
public class AirportsController extends ABaseController<Airports, AirportsIService>{

	public AirportsController(AirportsIService service) {
		super(service, "Airports");
		// TODO Auto-generated constructor stub
	}
	/*
	@Autowired
	private AirportsIRepository repository;
	

    @GetMapping
    public List<Airports> getAllAirports() {
        return repository.findAll();
    }

    @GetMapping("/{IATACode}")
    public Airports getAirportByIATACode(@PathVariable String IATACode) {
        return repository.findByIATACode(IATACode);
    }*/
}
