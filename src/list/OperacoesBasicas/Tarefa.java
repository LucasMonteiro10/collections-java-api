package list.OperacoesBasicas;

public class Tarefa {
	private String descricao;
	
	Tarefa(String descricao){
		this.descricao = descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return this.descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}
	
	
}
