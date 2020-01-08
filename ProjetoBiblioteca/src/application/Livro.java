package application;

public class Livro {

	private String titulo;
	private String autor;
	private int ano;
	private String categoria;
	private int numPrateleira;
	private int numEstante;
	private boolean emprestimo;

	public Livro(String titulo, String autor, int ano, String categoria, int numPrateleira, int numEstante,
			boolean emprestimo) {

		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
		this.categoria = categoria;
		this.numPrateleira = numPrateleira;
		this.numEstante = numEstante;
		this.emprestimo = emprestimo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getNumPrateleira() {
		return numPrateleira;
	}

	public void setNumPrateleira(int numPrateleira) {
		this.numPrateleira = numPrateleira;
	}

	public int getNumEstante() {
		return numEstante;
	}

	public void setNumEstante(int numEstante) {
		this.numEstante = numEstante;
	}

	public boolean isEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(boolean emprestimo) {
		this.emprestimo = emprestimo;
	}

}
