package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
	private List<Tarefa> tarefas;
	
	public ListaTarefas() {
		this.tarefas = new ArrayList<>();
	}

	public void adicionarTarefa(String descricao){
		tarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		
		List<Tarefa> tarefasRemover = new ArrayList<>();
		
		for(Tarefa t : tarefas) {
			if( t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasRemover.add(t);
			}
		}
		tarefas.removeAll(tarefasRemover);
	}
	
	public int obterNumeroTotalTarefas(){	
		return tarefas.size();
	}	
	
	public void obterDescricoesTarefas() {
		System.out.println(tarefas);
	}	
	
}
