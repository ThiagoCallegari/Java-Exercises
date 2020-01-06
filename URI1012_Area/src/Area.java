import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, areaTriangulo, areaCirculo, areaQuadrado, areaRetangulo, areaTrapezio;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		areaTriangulo = A * C / 2;
		areaCirculo = 3.14159 * Math.pow(C, 2);
		areaTrapezio = ((A + B) / 2) * C;
		areaQuadrado = Math.pow(B, 2);
		areaRetangulo = A * B;
		
		System.out.println();
		System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f\n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
		
		sc.close();
	}

}
