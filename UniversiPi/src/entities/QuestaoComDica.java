package entities;

public class QuestaoComDica extends QuestaoSimples {

	private String dica;

	public QuestaoComDica(String enunciado, String resposta, String dica) {
		super(enunciado, resposta);
		this.dica = dica;
	}

	public String getDica() {
		return dica;
	}

	public void setDica(String dica) {
		this.dica = dica;
	}
	
	public void aplicarQuestao() {
		System.out.println("*********************************");
		System.out.println("Questão: " + this.enunciado);
		System.out.println("Dica: " + this.dica);
		System.out.println("---------------------------------");
	}
	
	public boolean corrigir(String resposta) {
		boolean correcao;
		
		if (resposta.contentEquals(this.resposta)) {
			correcao = true;
			System.out.println("Sua resposta está correta!");
		}
		else {
			correcao = false;
			System.out.println("Sua resposta está errada!");
		}
		return correcao;
	}
}
