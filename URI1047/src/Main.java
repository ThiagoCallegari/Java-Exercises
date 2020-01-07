import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int horaI = sc.nextInt();
		int minI = sc.nextInt();
		int horaF = sc.nextInt();
		int minF = sc.nextInt();
		
		int HoraITotalEmMin = horaI * 60 + minI;
		int HoraFTotalEmMin = horaF * 60 + minF;
		
		int minTotalJogo;
		
		if (HoraFTotalEmMin > HoraITotalEmMin) {
			minTotalJogo = HoraFTotalEmMin - HoraITotalEmMin;
		}
		else {
			minTotalJogo = (24 * 60 - HoraITotalEmMin) + HoraFTotalEmMin;
		}
		
		int horasJogo = minTotalJogo / 60;
		int minsJogo = minTotalJogo % 60;
		
		System.out.println("O JOGO DUROU " + horasJogo + " HORA(S) E " + minsJogo + " MINUTO(S)");
		
		sc.close();
	}

}
