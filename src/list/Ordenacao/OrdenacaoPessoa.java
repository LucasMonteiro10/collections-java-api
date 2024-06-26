package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

	private List<Pessoa> pessoas;

	public OrdenacaoPessoa() {
		this.pessoas = new ArrayList();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade() {
		List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
		Collections.sort(pessoasPorIdade);
		
		return pessoasPorIdade;		
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
		Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
		
		return pessoasPorAltura;		
	}	
	
	  public static void main(String[] args) {
		    OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

		    ordenacaoPessoa.adicionarPessoa("Alice", 20, 1.56);
		    ordenacaoPessoa.adicionarPessoa("Bob", 30, 1.80);
		    ordenacaoPessoa.adicionarPessoa("Charlie", 25, 1.70);
		    ordenacaoPessoa.adicionarPessoa("David", 17, 1.56);
		    
		    System.out.println(ordenacaoPessoa.ordenarPorIdade());
		    System.out.println(ordenacaoPessoa.ordenarPorAltura());
	  }
}
