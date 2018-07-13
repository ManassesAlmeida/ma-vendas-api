package com.manasses.almeida.vendas.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manasses.almeida.vendas.model.Venda;
import com.manasses.almeida.vendas.repository.Vendas;
import com.manasses.almeida.vendas.service.VendasService;

@CrossOrigin("*")
@RestController
@RequestMapping("/vendas")
public class VendasResources {

	@Autowired
	private Vendas vendas;
	
	@Autowired
	private VendasService vendasService;
	
	@GetMapping
	public List<Venda> listar(){
		return vendas.findAll();
	}
	
	@PostMapping
	public Venda adicionar(@RequestBody @Valid Venda venda) {
		return vendasService.adicionar(venda);
	}
	
}
