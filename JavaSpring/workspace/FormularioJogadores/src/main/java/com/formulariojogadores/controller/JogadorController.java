package com.formulariojogadores.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.formulariojogadores.model.Jogador;

@Controller
public class JogadorController {

 private List<Jogador> jogadores = new ArrayList<>();
    
 @GetMapping("/cadastro")
 public String exibirFormulario() {
     return "Cadastro";
 }

 @PostMapping("/cadastrar")
 public String cadastrarJogador(@RequestParam String nome, @RequestParam int numeroJogador, Model model) {
      Jogador jogador = new Jogador();
      jogador.setNome(nome);
      jogador.setNumeroJogador(numeroJogador);
      jogadores.add(jogador);
                  
     return "redirect:/listar";
 }

 @GetMapping("/listar")
 public String listarJogadores(Model model) {
     model.addAttribute("jogadores", jogadores);
     return "Listagem";
 }
	
}
