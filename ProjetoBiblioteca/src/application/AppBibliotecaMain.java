package application;

import java.util.Scanner;

public class AppBibliotecaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Livro[] livro = new Livro[2];		
		
		livro[0] = new Livro("O nome do vento", "Patrick Rotfuss", 2006, "Fantasia", 5, 3, true);		
		livro[1] = new Livro("O sol é para todos", "Harper Lee", 1960, "Drama", 7, 1, false);
		
		System.out.print("Insira o Id do livro: ");
		int id = sc.nextInt();
		
		System.out.println();
		System.out.println("Título do livro: " + livro[id].getTitulo());
		System.out.println("Autor: " + livro[id].getAutor());
		System.out.println("Ano: " + livro[id].getAno());
		System.out.println("Categoria: " + livro[id].getCategoria());
		System.out.println("Nº da prateleira: " + livro[id].getNumPrateleira());
		System.out.println("Nº da estante: " + livro[id].getNumEstante());
		System.out.println("O livro está emprestado? " + livro[id].isEmprestimo());
		
		sc.close();
	}
}
