import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numEntradas = sc.nextInt();
		int valores[] = new int[numEntradas];
		
		for (int i=0; i<valores.length; i++) {
			valores[i] = sc.nextInt();
		}
		
		int sum = 0;
		for (int i=0; i<valores.length; i++) {
			for (int j=1; j<=valores[i]; j++) {
				if (valores[i] % j == 0) {
					sum++;
				}
			}
			
			if (sum == 2) {
				System.out.printf("%d eh primo%n", valores[i]);
			}
			else {
				System.out.printf("%d nao eh primo%n", valores[i]);
			}
			sum = 0;
		}		
		
		sc.close();
	}

}
