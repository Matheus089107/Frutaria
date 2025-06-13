package com.appfrutaria;

import com.appfrutaria.view.Atendente;
import com.appfrutaria.service.Estoque;


public class AppFrutaria {

	public static void main(String[] args) {

		Atendente atendente = new Atendente();
		
		boolean a = true;
		Estoque estoque = new Estoque();
		do {
			int opcaoMenuEscolhida = atendente.menuPrincipal();

			a = estoque.gerenciarEstoque(opcaoMenuEscolhida, atendente );
			
		} while (a);
		
		
	}

}