package com.manasses.almeida.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manasses.almeida.vendas.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
