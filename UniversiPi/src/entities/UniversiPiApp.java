package entities;

import java.util.Scanner;

public class UniversiPiApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		QuestaoSimples qS, qME, qCD;
		
		qS = new QuestaoSimples("Qual é o meu nome?", "Thiago");
		qME = new QuestaoMultiplaEscolha("Qual o verdadeiro nome do amor da minha vida?", "D", "Ana Bemfeliz", "Ana Imperatriz", "Ana Chafariz", "Ana Beatriz");
		qCD = new QuestaoComDica("Qual foi o primeiro filme que assistimos no cinema?", "Relatos Selvagens", "Filme argentino");
		
		qS.aplicarQuestao();
		String respostaQS = sc.nextLine();
		qS.corrigir(respostaQS);
		
		qME.aplicarQuestao();
		String respostaQME = sc.nextLine();
		qME.corrigir(respostaQME);
		
		qCD.aplicarQuestao();
		String respostaQCD = sc.nextLine();
		qCD.corrigir(respostaQCD);
	}
}
