import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double popA, popB;
		double percA, percB;

		int numTestes = sc.nextInt();

		for (int i = 0; i <= numTestes; i++) {
			popA = sc.nextDouble();
			popB = sc.nextDouble();
			percA = sc.nextDouble();
			percB = sc.nextDouble();

			int anos = 0;
			while (popB >= popA) {
				
			popA = (int)(popA * percA / 100) + popA;
			popB = (int)(popB * percB / 100) + popB;
			anos++;
			
			}

			if (anos > 100) {
				System.out.println("Mais de 1 seculo.");
			}
			else {
				System.out.printf("%d anos.", anos);
			}
		}

		sc.close();
	}

}
