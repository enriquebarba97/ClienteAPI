package com.github.enriquebarba97.clienteAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.enriquebarba97.clienteAPI.model.Cliente;
import com.github.enriquebarba97.clienteAPI.model.dto.ClienteDTO;
import com.github.enriquebarba97.clienteAPI.model.dto.ListaClientesDTO;
import com.github.enriquebarba97.clienteAPI.model.dto.SendClienteDTO;
import com.github.enriquebarba97.clienteAPI.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	
	@GetMapping()
	public ListaClientesDTO getAllClientes() {
		List<Cliente> lista = clienteService.findAllClientes();
		
		if(lista == null || lista.size()==0) {
			return new ListaClientesDTO(true, new ArrayList<Cliente>(), "No hay clientes");
		}else {
			return new ListaClientesDTO(false, lista, "");
		}
	}
	
	@GetMapping("/{id}")
	public ClienteDTO getClienteById(@PathVariable Long id) {
		Cliente cliente = clienteService.findClienteById(id);
		
		if(cliente == null) {
			return new ClienteDTO(true, new Cliente(), "Cliente no encontrado");
		}else {
			return new ClienteDTO(false, cliente, "");
		}
	}
	
	@PostMapping("")
	public ClienteDTO createCliente(@RequestBody SendClienteDTO clienteDTO) {
		Cliente cliente = new Cliente(null, clienteDTO.getNombre(), clienteDTO.getTlf());
		
		Cliente result = clienteService.saveCliente(cliente);
		
		if(result == null) {
			return new ClienteDTO(true, new Cliente(), "Ha habido un error añadiendo el cliente");
		}else {
			return new ClienteDTO(false, result, "");
		}
	}
	
	
}
