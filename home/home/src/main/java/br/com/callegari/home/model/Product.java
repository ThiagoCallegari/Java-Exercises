package br.com.callegari.home.model;

public class Product {

	private int id;
	private String titulo;
	private String detalhes;
	private double preco;
	private int qtdEstoque;
	private String linkFoto;
	
	public Product(int id, String titulo, String detalhes, double preco, int qtdEstoque, String linkFoto) {
		this.id = id;
		this.titulo = titulo;
		this.detalhes = detalhes;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.linkFoto = linkFoto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", titulo=" + titulo + ", detalhes=" + detalhes + ", preco=" + preco
				+ ", qtdEstoque=" + qtdEstoque + ", linkFoto=" + linkFoto + "]";
	}
}
