package com.tarefa2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tarefa2.model.Tarefas;

@Controller
public class TarefaController {

	@GetMapping("/listando")
	public String lista(Model model) {
		
		List<Tarefas> dados = new ArrayList<>();
		
		dados.add(new Tarefas(1, "Acordar"));
		dados.add(new Tarefas(2, "Tomar Café"));
		dados.add(new Tarefas(3, "Tomar Banho"));
		dados.add(new Tarefas(4, "Ir para o Bytes"));
		dados.add(new Tarefas(5, "Ir para a casa Almoçar"));
		dados.add(new Tarefas(6, "Voltar para o Bytes"));
		dados.add(new Tarefas(7, "Ir para Casa"));
		dados.add(new Tarefas(8, "Jantar"));
		dados.add(new Tarefas(9, "Ver série"));
		dados.add(new Tarefas(10, "Estudar"));
		dados.add(new Tarefas(11, "Tomar Banho"));
		dados.add(new Tarefas(12, "Dormir"));
		
		model.addAttribute("x", dados);
		
		return "ViewList";
		
	}
	
}
