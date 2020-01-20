package br.com.callegari.crudTeste.model;

public class Veiculo {

	private int id;
	private String marca;
	private String modelo;
	private int ano;
	private String cor;
	private String tipo;
	private float preco;
	private String detalhes;
	
	public Veiculo(int id, String marca, String modelo, int ano, String cor, String tipo, float preco,
			String detalhes) {
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.tipo = tipo;
		this.preco = preco;
		this.detalhes = detalhes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	/*@Override
	public String toString() {
		return "Veiculo [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor
				+ ", tipo=" + tipo + ", preco=" + preco + ", detalhes=" + detalhes + "]";
	}*/
}
