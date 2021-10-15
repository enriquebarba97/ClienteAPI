package com.github.enriquebarba97.clienteAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.enriquebarba97.clienteAPI.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
