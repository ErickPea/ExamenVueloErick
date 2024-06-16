package com.examen.vuelos.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.vuelos.Entity.Users;
import com.examen.vuelos.IService.UsersIService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Users")
public class UsersController extends ABaseController<Users, UsersIService>{

	public UsersController(UsersIService service) {
		super(service, "Users");
		// TODO Auto-generated constructor stub
	}

}
