package application;

import java.util.Scanner;

public class AppBibliotecaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String titulo, autor, categoria;
		int ano, prateleira, estante, emprestimoResp;
		boolean emprestimo;
		
		System.out.print("T�tulo do livro: ");
		titulo = sc.nextLine();
		System.out.print("Autor: ");
		autor = sc.nextLine();
		System.out.print("Ano: ");
		ano = sc.nextInt();
		System.out.print("Categoria: ");
		sc.nextLine();
		categoria = sc.nextLine();
		System.out.print("N� da prateleira: ");
		sc.nextLine();
		prateleira = sc.nextInt();
		System.out.print("N� da estante: ");
		estante = sc.nextInt();
		System.out.print("Est� emprestado? (true = 1/false = 2)");
		emprestimoResp = sc.nextInt();
		
		if (emprestimoResp == 1) {
			emprestimo = true;
		}
		else {
			emprestimo = false;
		}
		
		Livro livro = new Livro("O nome do vento", "Patrick Rotfuss", 2006, "Fantasia", prateleira, estante, true);		
		Livro meuLivro = new Livro(titulo, autor, ano, categoria, prateleira, estante, emprestimo);
		
		System.out.println();
		System.out.println("T�tulo do livro: " + meuLivro.getTitulo());
		System.out.println("Autor: " + meuLivro.getAutor());
		System.out.println("Ano: " + meuLivro.getAno());
		System.out.println("Categoria: " + meuLivro.getCategoria());
		System.out.println("N� da prateleira: " + meuLivro.getNumPrateleira());
		System.out.println("N� da estante: " + meuLivro.getNumEstante());
		System.out.println("O livro est� emprestado? " + meuLivro.isEmprestimo());
		
		sc.close();
	}

}
