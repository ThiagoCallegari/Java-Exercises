import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a;
		float b;
		String txt;
		
		System.out.print("Digite um nome: ");
		txt = sc.nextLine();
		System.out.print("Digite um valor inteiro: ");
		a = sc.nextInt();
		System.out.print("Digite um valor real: ");
		b = sc.nextFloat();
		
		System.out.println();
		System.out.printf("O nome digitado foi %s, o  valor inteiro foi %d e o valor real foi %.2f", txt, a, b);
		
		sc.close();		
	}
}
