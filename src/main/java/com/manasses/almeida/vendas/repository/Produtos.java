package com.manasses.almeida.vendas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manasses.almeida.vendas.model.Produto;

public interface Produtos extends JpaRepository<Produto, Long> {

}
