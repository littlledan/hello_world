package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/impressao")
public class HelloWorldController {

	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "<strong>BSM’s Generation Brazil:</strong><br/>Persistência.<br/>"
	            + "Mentalidade de Crescimento.<br/>"
	            + "Responsabilidade Pessoal.<br/>"
	            + "Orientação ao Futuro.<br/>"
	            + "Proatividade.<br/>"
	            + "Comunicação.<br/>"
	            + "Trabalho em Equipe.<br/>"
	            + "Orientação ao Detalhe.";
	}
	
	@GetMapping("/aprendizagem")
	public String aprendizagem() {
		return "<strong>Objetivos de aprendizagem para esta semana:</strong><br/>Melhorar a Orientação ao detalhe.<br/>"
				+ "Praticar POO.<br/>"
				+ "Aprender e Praticar mais SQL no geral.";
	}
	
}


