package com.manasses.almeida.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manasses.almeida.vendas.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long> {

}
