package dados;

import java.util.List;

public class Contribuinte {
	private int id;
	private String cpf;
	private String nome;
	private String endereco;
	private int idade;
	private int contaBancaria;
	private List<Dependente> dependente;
	private List<Bem> bem;
	private List<NotaFiscal> despesas;
	private List<Contracheque> receitas;
	
	public String toString() {
	    return this.nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getContaBancaria() {
		return contaBancaria;
	}
	public void setContaBancaria(int contaBancaria) {
		this.contaBancaria = contaBancaria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Dependente> getDependente() {
		return dependente;
	}
	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}
	public List<Bem> getBem() {
		return bem;
	}
	public void setBem(List<Bem> bem) {
		this.bem = bem;
	}
	public List<NotaFiscal> getDespesas() {
		return despesas;
	}
	public void setDespesas(List<NotaFiscal> despesas) {
		this.despesas = despesas;
	}
	public List<Contracheque> getReceitas() {
		return receitas;
	}
	public void setReceitas(List<Contracheque> receitas) {
		this.receitas = receitas;
	}
	
	
	
	

}
