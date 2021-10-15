package com.github.enriquebarba97.clienteAPI.model.dto;

import java.util.List;

import com.github.enriquebarba97.clienteAPI.model.Cliente;

import lombok.Data;

@Data
public class ClienteDTO {

	private Boolean error;
	private Cliente cliente;
	private String mensaje;

	public ClienteDTO(Boolean error, Cliente cliente, String mensaje) {
		this.error = error;
		this.cliente = cliente;
		this.mensaje = mensaje;
	}
	
}
