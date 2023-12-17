package com.devlucasboaraujo.nutricao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NutricionistaController {
	
	@GetMapping(path = "api/nutricionista-id/{}")
	public void buscarNutricionistaPorId() {
		
	}

	
}
