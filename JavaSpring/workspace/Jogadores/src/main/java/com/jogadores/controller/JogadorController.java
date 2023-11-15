package com.jogadores.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.jogadores.model.Jogador;

@Controller
public class JogadorController {
	
	@GetMapping("/time")
	public String listaJogadores(Model model) {
		
		List<Jogador> jogadores = new ArrayList();
		
		jogadores.add(new Jogador(1, "Fabio"));
		jogadores.add(new Jogador(2, "Jader"));
		jogadores.add(new Jogador(3, "Ribeiro"));
		jogadores.add(new Jogador(4, "Gilberto"));
		jogadores.add(new Jogador(5, "Felipe Melo"));
		jogadores.add(new Jogador(6, "Bruno Henrique"));
		jogadores.add(new Jogador(7, "Gustavo Scarpa"));
		jogadores.add(new Jogador(8, "Keno"));
		jogadores.add(new Jogador(9, "Endrick"));
		jogadores.add(new Jogador(10, "Suarez"));
		jogadores.add(new Jogador(11, "Hulk"));
		
		model.addAttribute("listados", jogadores);
		
		return "ViewJogadores";
	} 

}
