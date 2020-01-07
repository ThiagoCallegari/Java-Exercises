import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valores[] = new int[2];
		
		valores[0] = sc.nextInt();
		valores[1] = sc.nextInt();
		
		while (valores[0] > 0 && valores[1] > 0) {
						
			int menor = valores[0];
			int maior = valores[1];
			
			if (menor > valores[1]) {
				menor = valores[1];
			}
			
			if (maior < valores[0]) {
				maior = valores[0];
			}
			
			int sum = 0;
			for (int i = menor; i<=maior; i++) {
				System.out.print(i + " ");
				sum+=i;
			}
			
			System.out.printf("Sum=%d%n", sum);
			
			valores[0] = sc.nextInt();
			valores[1] = sc.nextInt();
		} 
		
		sc.close();
	}

}
