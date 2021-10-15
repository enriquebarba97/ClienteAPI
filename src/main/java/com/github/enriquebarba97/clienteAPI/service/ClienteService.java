package com.github.enriquebarba97.clienteAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.enriquebarba97.clienteAPI.model.Cliente;
import com.github.enriquebarba97.clienteAPI.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAllClientes() {
		return clienteRepository.findAll();
	}
	
	public Cliente findClienteById(Long id) {
		return clienteRepository.findById(id).orElse(null);
	}
	
	public Cliente saveCliente(Cliente cliente) {
		Cliente saved = clienteRepository.save(cliente);
		return saved;
	}
	
	public void deleteCliente(Long id) {
		clienteRepository.deleteById(id);
	}
}
