package br.com.seusite.NomeProjeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // Retorna um arquivo como html por exemplo

public class OlaMundoController {
	
@GetMapping("/om")
	
	public String msg() {
		return "olamundo"; //O nome do retorno deve ser exatamente o mesmo do arquivo html
	}
	
}
