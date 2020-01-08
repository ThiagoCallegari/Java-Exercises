import java.util.Scanner;

public class AppQueTestaTV {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		Televisao t1;
		
		t1 = new Televisao("Sony", 110, 32, 1);
		
		do {
			System.out.println("*******************************");
			System.out.println("     Controle remoto da TV     ");
			System.out.println("*******************************");
			System.out.println("1 - Ligar/Desligar");
			System.out.println("2 - Aumentar volume");
			System.out.println("3 - Diminuir volume");
			System.out.println("4 - Avancar canal");
			System.out.println("5 - Voltar canal");
			System.out.println("0 - Encerrar sistema");
			System.out.println("*******************************");
			
			System.out.print("Digite o número da opção: ");
			opcao = sc.nextInt();
			
			// Lógica das opções
			
			switch(opcao) {
			case 0:
				t1.encerrarSistea();
				break;
			case 1:
				t1.switchPower();
				break;
			case 2:
				t1.aumentarVolume();
				break;
			case 3:
				t1.diminuirVolume();
				break;
			case 4:
				t1.avancarCanal();
				break;
			case 5:
				t1.retrocederCanal();
				break;
			}
			
			System.out.println();
			
		} while (opcao != 0);
		
		sc.close();
	}
}
