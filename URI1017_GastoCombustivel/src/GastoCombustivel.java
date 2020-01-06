import java.util.Scanner;

public class GastoCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tempHoras, velocidadeMedia; 
		double qtdLitros;
		
		tempHoras = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		
		qtdLitros = (double) tempHoras * velocidadeMedia / 12;
		
		System.out.printf("%.3f%n", qtdLitros);
		
		sc.close();
	}
}
