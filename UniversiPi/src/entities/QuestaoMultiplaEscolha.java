package entities;

public class QuestaoMultiplaEscolha extends QuestaoSimples {

	private String alternativa1;
	private String alternativa2;
	private String alternativa3;
	private String alternativa4;
	
	public QuestaoMultiplaEscolha(String enunciado, String resposta, String alternativa1, String alternativa2,
			String alternativa3, String alternativa4) {
		super(enunciado, resposta);
		this.alternativa1 = alternativa1;
		this.alternativa2 = alternativa2;
		this.alternativa3 = alternativa3;
		this.alternativa4 = alternativa4;
	}

	public String getAlternativa1() {
		return alternativa1;
	}

	public void setAlternativa1(String alternativa1) {
		this.alternativa1 = alternativa1;
	}

	public String getAlternativa2() {
		return alternativa2;
	}

	public void setAlternativa2(String alternativa2) {
		this.alternativa2 = alternativa2;
	}

	public String getAlternativa3() {
		return alternativa3;
	}

	public void setAlternativa3(String alternativa3) {
		this.alternativa3 = alternativa3;
	}

	public String getAlternativa4() {
		return alternativa4;
	}

	public void setAlternativa4(String alternativa4) {
		this.alternativa4 = alternativa4;
	}

	public void aplicarQuestao() {
		System.out.println("*********************************");
		System.out.println("Questão: " + this.enunciado);
		System.out.println();
		System.out.println("A) " + this.alternativa1);
		System.out.println("B) " + this.alternativa2);
		System.out.println("C) " + this.alternativa3);
		System.out.println("D) " + this.alternativa4);
		System.out.println("---------------------------------");
	}
	
	public boolean corrigir(String resposta) {
		boolean correcao;
		
		if (resposta.equals(this.resposta)) {
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
