package br.com.tarefas.Tarefas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarefas.Tarefas.model.Tarefa;


@Controller
public class TarefaController {

	@GetMapping("/listar")
	public String lista(Model model) {
		
		List<Tarefa> dados = new ArrayList<>();
		
		dados.add(new Tarefa(1, "Jogar Video Game"));
		dados.add(new Tarefa(2, "Fazer Almoço"));
		dados.add(new Tarefa(3, "Fazer Faxina"));
		dados.add(new Tarefa(4, "Ir ao Cinema"));
		dados.add(new Tarefa(5, "Fazer janta"));
		dados.add(new Tarefa(6, "Jantar"));
		dados.add(new Tarefa(7, "Ver Série"));
		dados.add(new Tarefa(8, "Arrumar Quarto"));
		dados.add(new Tarefa(9, "Tomar Remédio"));
		dados.add(new Tarefa(10, "Tomar Banho"));
		dados.add(new Tarefa(11, "Deitar e Dormir"));
		
		model.addAttribute("x", dados);
		
		return "viewlist";
		
	};
}
