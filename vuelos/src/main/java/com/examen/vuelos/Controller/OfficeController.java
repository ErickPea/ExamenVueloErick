package com.examen.vuelos.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examen.vuelos.Entity.Office;

import com.examen.vuelos.IService.OfficeIService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Office")
public class OfficeController extends ABaseController<Office, OfficeIService>{

	public OfficeController(OfficeIService service) {
		super(service, "Office");
		// TODO Auto-generated constructor stub
	}

}
