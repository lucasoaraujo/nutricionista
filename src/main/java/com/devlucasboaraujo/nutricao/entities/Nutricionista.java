package com.devlucasboaraujo.nutricao.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "nutricionista")
public class Nutricionista {
	
	@Id
	private Long id;
	private String nome;
	private LocalDate idade;
	
	@Column(name = "codigo_registro")
	private String codigoRegistro;
	
	@Column(name = "id_paciente")
	private Long idPaciente;
	
	@SuppressWarnings("unused")
	private Nutricionista() {
		
	}
	
	public Nutricionista(String nome, LocalDate idade, String codigoRegistro, Long idPaciente) {
		this.nome = nome;
		this.idade = idade;
		this.codigoRegistro = codigoRegistro;
		this.idPaciente = idPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getIdade() {
		return idade;
	}

	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}

	public String getCodigoRegistro() {
		return codigoRegistro;
	}

	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public Long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	

}
