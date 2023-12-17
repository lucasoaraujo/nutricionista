package com.devlucasboaraujo.nutricao.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.devlucasboaraujo.nutricao.entities.Nutricionista;
import com.devlucasboaraujo.nutricao.repository.NutricionistaRepository;

public class CadastroNutricionistaService {
	
	@Autowired
	private NutricionistaRepository nutricionistaRepository;

	public void cadastro(Nutricionista nutricionista) {
		nutricionistaRepository.saveAndFlush(nutricionista);
		
	}

}
