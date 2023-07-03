package Models;

public class Casa {
	private int id;
	private String endereco;
	private String cep;
	private double preco;
	private double tamanho;
	public Casa(int id, String endereco, String cep, double preco, double tamanho) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.cep = cep;
		this.preco = preco;
		this.tamanho = tamanho;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getTamanho() {
		return tamanho;
	}
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	public Casa() {
		super();
	}
	@Override
	public String toString() {
		return "Casa [id=" + id + ", endereco=" + endereco + ", cep=" + cep + ", preco=" + preco + ", tamanho="
				+ tamanho + "]\n";
	}
	
	
}
