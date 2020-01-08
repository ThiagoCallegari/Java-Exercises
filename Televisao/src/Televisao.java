
public class Televisao {

	// informações sobre uma TV

	private String marca;
	private int voltagem;
	private int tamanho;
	private boolean ligada;
	private int volume;
	private int canal;
	private int opcao;
	
	public Televisao(String marca, int voltagem, int tamanho, int opcao) {
		this.marca = marca;
		this.voltagem = voltagem;
		this.tamanho = tamanho;
		this.ligada = false;
		this.volume = 5;
		this.canal = 1;
		this.opcao = opcao;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getOpcao() {
		return opcao;
	}

	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}

	void switchPower() {
		ligada = !ligada;
		System.out.println("A TV " + marca + " esta " + ((ligada) ? "ligada" : "desligada"));
		/*
		 * Operador ternário de atribuição. (<Teste lógico>)? <ValorTesteVerdadeiro> :
		 * <ValorTesteFalso>;
		 */
	}

	void aumentarVolume() {

		if (ligada /*== true*/) {
			if (volume < 10) {
				volume++;
				System.out.println("A TV " + marca + " esta no volume " + volume);
			} else if (volume == 10) {
				System.out.println("O volume máximo já foi atingido!");
			}
		} else {
			System.out.println("Ligue a Tv primeiro!");
		}

	}

	void diminuirVolume() {

		if (ligada) {
			if (volume > 0) {
				volume--;
				System.out.println("A TV " + marca + " esta no volume " + volume);
			} else if (volume == 0) {
				System.out.println("O volume mínimo já foi atingido!");
			}
		} else {
			System.out.println("Ligue a Tv primeiro!");
		}
	}

	void avancarCanal() {

		if (ligada) {
			if (canal < 10) {
				canal++;
				System.out.println("A TV " + marca + " está no canal " + canal);
			} else if (canal == 10) {
				canal = 1;
				System.out.println("A TV " + marca + " está no canal " + canal);
			}
		} else {
			System.out.println("Ligue a Tv primeiro!");
		}
	}

	void retrocederCanal() {

		if (ligada) {
			if (canal > 1) {
				canal--;
				System.out.println("A TV " + marca + " está no canal " + canal);
			} else if (canal == 1) {
				canal = 10;
				System.out.println("A TV " + marca + " está no canal " + canal);
			}
		} else {
			System.out.println("Ligue a Tv primeiro!");
		}
	}
	
	void encerrarSistea() {
		opcao = 0;
	}
}
