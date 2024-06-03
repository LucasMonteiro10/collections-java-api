package list.OperacoesBasicas;

public class Main {

	public static void main(String[] args) {
		ListaTarefas tarefasTeste = new ListaTarefas();
		
		tarefasTeste.adicionarTarefa("Estudar Java");
		
		tarefasTeste.adicionarTarefa("Estudar Selenium");
		
		tarefasTeste.adicionarTarefa("Estudar Ruby");
		
		tarefasTeste.removerTarefa("Estudar Java");
		
		System.out.println(tarefasTeste.obterNumeroTotalTarefas());
		
		tarefasTeste.obterDescricoesTarefas();

	}

}
