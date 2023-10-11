package br.com.seusite.NomeProjeto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RestController retorna apenas um texto

public class OlaMundoRest {
	
	@GetMapping("/")
	
	public String msg() {
		return "Olá Mundo!";
	}
	
	@GetMapping("/ola")
	public String msg2() {
		return "Olá mundo 2 o Retorno";
	}
	
}
