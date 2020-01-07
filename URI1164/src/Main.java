import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int valor[] = new int[N];
		int cont = 0;

		for (int i=0; i<valor.length; i++) {
			valor[i] = sc.nextInt();
		}

		for (int i=0; i<valor.length; i++) {
			for (int j = 1; j < valor[i]; j++) {
				if (valor[i] % j == 0) {
					cont += j;
				}
			}

			if (valor[i] == cont) {
				System.out.printf("%d eh perfeito%n", valor[i]);
			} 
			else {
				System.out.printf("%d nao eh perfeito%n", valor[i]);
			}
			cont = 0;
		}

		sc.close();
	}
}
