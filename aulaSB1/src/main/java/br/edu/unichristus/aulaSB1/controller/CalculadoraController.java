package br.edu.unichristus.aulaSB1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.unichristus.aulaSB1.service.CalculadoraService;

@RestController
@RequestMapping("/api/v1/calculadora")
public class CalculadoraController {
	
	@Autowired
	CalculadoraService service;
	
	@GetMapping()
	public double somar(double n1, double n2) {
		return service.somar(n1, n2);
	}
	
	
}