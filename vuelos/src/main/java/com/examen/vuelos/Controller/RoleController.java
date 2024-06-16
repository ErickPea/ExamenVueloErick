package com.examen.vuelos.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.examen.vuelos.Entity.Role;
import com.examen.vuelos.IService.RoleIService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/Role")
public class RoleController extends ABaseController<Role, RoleIService>{

	public RoleController(RoleIService service) {
		super(service, "Role");
		// TODO Auto-generated constructor stub
	}

}
