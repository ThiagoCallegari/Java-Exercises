import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valores[] = new double[6];
		
		for (int i = 0; i<valores.length; i++) {
			valores[i] = sc.nextDouble();
		}
		
		int cont = 0;
		
		for (double i : valores) {
			if (i > 0) {
				cont++;
			}
		}
		
		System.out.printf("%d valores positivos%n", cont);
		
		sc.close();
	}

}
