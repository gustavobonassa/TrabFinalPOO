package dados;

public class PessoaJuridica {
	private int id;
	private String cnpj;
	private String nomePJ;
	private String endereco;
	private int numFuncionarios;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNomePJ() {
		return nomePJ;
	}
	public void setNomePJ(String nomePJ) {
		this.nomePJ = nomePJ;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios(int numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
