package com.github.enriquebarba97.clienteAPI.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String nombre;
	
	private String tlf;
	
	
	public Cliente() {
		
	}
	
	public Cliente(Long id, String nombre, String tlf) {
		this.id = id;
		this.nombre = nombre;
		this.tlf = tlf;
	}
}
