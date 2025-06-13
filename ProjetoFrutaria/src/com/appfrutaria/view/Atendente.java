package com.appfrutaria.view;

import java.util.Scanner;
import com.appfrutaria.model.Fruta;

public class Atendente {

	Scanner imput;

	public Atendente() {

		imput = new Scanner(System.in);

	}

	public int menuPrincipal() {

		System.out.println("====Tabela Frutaria====");
		System.out.println("1 - Cadastrar produto");
		System.out.println("2 - Listar produtos");
		System.out.println("3 - Remover produto");
		System.out.println("=======================");
		System.out.println("0 - Sair");

		int opcaoMenu = imput.nextInt();
		return opcaoMenu;
	}

	public String cadastrarNome() {

		System.out.println("Digite o nome do produto: ");
		String nome = imput.nextLine();
		imput.nextLine();
		return nome;
	}

	public double cadastrarPreco() {
		System.out.println("Preço do produto: ");
		Double preco = imput.nextDouble();
		return preco;

	}

	public int cadastrarQuantidade() {
		System.out.println("Digite a quantidade: ");
		int quantidade = imput.nextInt();
		return quantidade;
	}
	public void listarFruta(Fruta fruta) {
		System.out.println(fruta.getNome());
		System.out.println(fruta.getPreco());
		System.out.println(fruta.getQuantidade());
		}
	
	public int escolhaRemoverProduto () {
		System.out.println("qual produto você deseja excluir: //aceitamos apenas números");
		int opcao = imput.nextInt();
		return opcao;
	}

	public Scanner getImput() {
		return imput;
	}

	public void setImput(Scanner imput) {
		this.imput = imput;
	}
}
