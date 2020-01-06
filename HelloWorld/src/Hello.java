public class Hello {

	public static void main(String[] args) {
		
		float salMinimo, quantKw, valDe1KwReais, valReaisPago, desc10;

		salMinimo = Float.parseFloat(args[0]);
		quantKw = Float.parseFloat(args[1]);

		valDe1KwReais = salMinimo / 700;
		valReaisPago = quantKw * valDe1KwReais;
		desc10 = valReaisPago * 0.90F;

		System.out.println("Valor de 1 Kw: " + valDe1KwReais);
		System.out.println("Valor pago em reais: R$" + valReaisPago);
		System.out.println("Valor pago com desconte de 10%: R$" + desc10);
	}
}
