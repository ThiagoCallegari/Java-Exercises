package entities;

public class Produto {
	
	private int id;
	private String nome;
	private String detalhes;
	private float preco;
	private float qtdEstoque;
	
	/*public Produto(int id, String nome, String detalhes, float preco, float qtdEstoque) {
		this.id = id;
		this.nome = nome;
		this.detalhes = detalhes;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}*/
	
	public Produto() {
		
	}

	public int getId() {
		return id;
	}

	

	public void setId(int id) throws Exception{
		if (id <= 0) {
			throw new Exception("O número não pode ser negativo ou igual a zero");
		}
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.length() == 0) {
			throw new RuntimeException("O campo nome não pode ser vazio");
		}
		this.nome = nome;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		if (detalhes == null || detalhes.length() == 0) {
			throw new RuntimeException("O campo detalhes não pode ser vazio");
		}
		this.detalhes = detalhes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if (preco <= 0) {
			throw new RuntimeException("O campo valor não pode conte números menores ou iguais a zero");
		}
		this.preco = preco;
	}

	public float getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(float qtdEstoque) {
		if (qtdEstoque < 0) {
			throw new RuntimeException("O campo quantidade em estoque não pode conte números menores ou iguais a zero");
		}
		this.qtdEstoque = qtdEstoque;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", detalhes=" + detalhes + ", preco=" + preco + ", qtdEstoque="
				+ qtdEstoque + "]";
	}	
}
