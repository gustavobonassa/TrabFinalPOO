package dados;

public class NotaFiscal {
	private int id;
	private int numProtocolo;
	private String cnpj;
	private float valor;
	private String descricao;
	public int getNumProtocolo() {
		return numProtocolo;
	}
	public void setNumProtocolo(int numProtocolo) {
		this.numProtocolo = numProtocolo;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
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
	
	
}
