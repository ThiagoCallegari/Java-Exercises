import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double temporario;

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();

		// Define o maior.
		if (B > A && B > C) {
			temporario = A;
			A = B;
			B = temporario;
		}
		else if (C > A && C > B) {
			temporario = A;
			A = C;
			C = temporario;
		}

		// Define o segundo maior.
		if (C > B) {
			temporario = B;
			B = C;
			C = temporario;
		}
		
		// Define o tipo de triângulo.
		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
			System.out.println("TRIANGULO RETANGULO");
		}
		else if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if (A == B && B != C || A == C && C != B || B == C && A != B) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		sc.close();
	}

}
