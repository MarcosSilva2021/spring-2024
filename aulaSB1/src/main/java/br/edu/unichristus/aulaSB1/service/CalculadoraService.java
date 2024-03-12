package br.edu.unichristus.aulaSB1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
	
	public double somar(double n1, double n2) {
		return n1 + n2;
	}
	
	public double sub(double n1, double n2) {
		return n1 - n2;
	}
	
	public double mult(double n1, double n2) {
		return n1 * n2;
	}
	
	public double div(double n1, double n2) {
		return n1 / n2;
	}

}
