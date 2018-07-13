package com.manasses.almeida.vendas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manasses.almeida.vendas.model.Produto;
import com.manasses.almeida.vendas.repository.Produtos;

@CrossOrigin("*")
@RestController
@RequestMapping("/produtos")
public class ProdutosResources {

	@Autowired
	private Produtos produtos;
	
	@GetMapping
	public List<Produto> listar(){
		return produtos.findAll();
	}
	
	
}
