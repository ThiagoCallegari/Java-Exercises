package application;

import java.util.Scanner;

import entities.Produto;

public class MainCadastro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Produto[] lista = new Produto[2];

		int cont = 0;

		do {

			try {
				System.out.println("------------ Posição: " + cont);
				
				Produto prod = new Produto();

				System.out.print("Id do produto: ");
				int prodId = Integer.parseInt(sc.nextLine());
				prod.setId(prodId);
				System.out.print("Nome do produto: ");
				String prodNome = sc.nextLine();
				prod.setNome(prodNome);
				System.out.print("Detalhes do produto: ");
				String prodDetalhes = sc.nextLine();
				prod.setDetalhes(prodDetalhes);
				System.out.print("Preço do produto: ");
				float prodPreco = Float.parseFloat(sc.nextLine());
				prod.setPreco(prodPreco);
				System.out.print("Quantidade no estoque: ");
				float prodEstoque = Float.parseFloat(sc.nextLine());
				prod.setQtdEstoque(prodEstoque);

				lista[cont] = prod;
				cont++;
			} catch (Exception e) {
				System.out.println("Erro ao cadastrar!");
				System.out.println("Motivo: " + e.getMessage());
			}

		} while (cont < 2);

		for (Produto p : lista) {
			System.out.println(p);
		}

		sc.close();
	}
}
