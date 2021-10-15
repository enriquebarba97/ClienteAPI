package com.github.enriquebarba97.clienteAPI.model.dto;

import java.util.List;

import com.github.enriquebarba97.clienteAPI.model.Cliente;

import lombok.Data;

@Data
public class ListaClientesDTO {
	
	private Boolean error;
	private List<Cliente> lista;
	private String mensaje;

	public ListaClientesDTO(Boolean error, List<Cliente> lista, String mensaje) {
		this.error = error;
		this.lista = lista;
		this.mensaje = mensaje;
	}
}
