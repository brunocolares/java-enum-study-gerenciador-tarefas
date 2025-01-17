package entities;

import entities.enums.StatusTarefa;

public class Tarefa {
	
	private int id;
	private String descricao;
	private StatusTarefa statusTarefa;
	
	public Tarefa() {
		
	}
	
	public Tarefa(int id, String descricao, StatusTarefa statusTarefa) {
		this.id = id;
		this.descricao = descricao;
		this.statusTarefa = statusTarefa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public StatusTarefa getStatusTarefa() {
		return statusTarefa;
	}

	public void setStatusTarefa(StatusTarefa statusTarefa) {
		this.statusTarefa = statusTarefa;
	}
	
	public void exibirInformacao() {
		System.out.printf("ID: %d%nDESCRIÇÃO: %s%nStatus: %s", getId(), getDescricao(), getStatusTarefa());
	}
}
