package application;

import java.util.ArrayList;
import java.util.List;

import entities.Tarefa;
import entities.enums.StatusTarefa;

public class GerenciadorTarefas {
	
	private List<Tarefa> tarefaList;
	
	public GerenciadorTarefas() {
		tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(Tarefa tarefa) {
		tarefaList.add(tarefa);
	}
	
	public void exibirTarefas() {
		for(Tarefa tarefa : tarefaList) {
			tarefa.exibirInformacao();
		}
	}
	
	public void atualizarStatusTarefa(int id, StatusTarefa statusTarefa) {
		Tarefa tarefa = tarefaList.stream().filter(taref -> taref.getId() == id).findFirst().orElse(null);
		tarefa.setStatusTarefa(statusTarefa);
	}
	
	public void exibirTarefasPorStatus(StatusTarefa statusTarefa) {
		for(Tarefa tarefa : tarefaList) {
			if(tarefa.getStatusTarefa().equals(statusTarefa)) {
				tarefa.exibirInformacao();
			}
		}
	}

}
