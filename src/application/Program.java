package application;

import java.util.Scanner;

import entities.Tarefa;
import entities.enums.StatusTarefa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();
		while(opcao != 5) {
			System.out.println("* MENU:");
			System.out.println("1 - Adicionar tarefa");
			System.out.println("2 - Atualizar status da tarefa");
			System.out.println("3 - Listar todas as tarefas");
			System.out.println("4 - Filtrar tarefas por status");
			System.out.println("5 - Sair");
			System.out.print("- Digite a opção desejada: ");
			opcao = sc.nextInt();
			
			switch(opcao) {
				case 1: {
					Tarefa tarefa = new Tarefa();
					System.out.println("Digite o id da tarefa: ");
					int id = sc.nextInt();
					System.out.println("Digite a descrição da tarefa: ");
					sc.nextLine();
					String descricao = sc.nextLine();
					tarefa.setId(id);
					tarefa.setDescricao(descricao);
					tarefa.setStatusTarefa(StatusTarefa.PENDENTE);
					gerenciadorTarefas.adicionarTarefa(tarefa);
					break;
				}
				case 2: {
					System.out.println("Digite o id da tarefa: ");
					int id = sc.nextInt();
					System.out.println("Digite o status desejado da tarefa: ");
					String status = sc.nextLine();
					gerenciadorTarefas.atualizarStatusTarefa(id, StatusTarefa.valueOf(status));
					break;
				} 
				case 3: {
					gerenciadorTarefas.exibirTarefas();
					break;
				}
				case 4: {
					System.out.println("Digite o status desejado da tarefa para listar: ");
					String status = sc.nextLine();
					try {
						gerenciadorTarefas.exibirTarefasPorStatus(StatusTarefa.valueOf(status.toUpperCase()));
					} catch(IllegalArgumentException e) {
						System.out.println("Situação inválida, repita o processo.");
					}
					
					break;
				}
				case 5: {
					System.out.println("Aplicação finalizada.");
					break;
				} default: {
					System.out.println("Opção inexistente");
				}
			}
		}
		

	}

}
