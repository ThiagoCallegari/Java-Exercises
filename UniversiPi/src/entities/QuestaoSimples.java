package entities;

public class QuestaoSimples {

	protected String enunciado;
	protected String resposta;
	
	public QuestaoSimples(String enunciado, String resposta) {
		this.enunciado = enunciado;
		this.resposta = resposta;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	public void aplicarQuestao() {
		System.out.println("*********************************");
		System.out.println("Quest�o: " + this.enunciado);
		System.out.println("---------------------------------");
	}
	
	public boolean corrigir(String resposta) {
		boolean correcao;
		
		if (resposta.contentEquals(this.resposta)) {
			correcao = true;
			System.out.println("Sua resposta est� correta!");
		}
		else {
			correcao = false;
			System.out.println("Sua resposta est� errada!");
		}
		return correcao;
	}
}
