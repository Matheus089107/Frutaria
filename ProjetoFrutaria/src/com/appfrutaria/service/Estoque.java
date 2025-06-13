package com.appfrutaria.service;

import com.appfrutaria.model.Fruta;
import com.appfrutaria.view.Atendente;
import java.util.ArrayList;
import java.util.List;

public class Estoque {

	List<Fruta> estoqueFruta;

	public Estoque() {

		estoqueFruta = new ArrayList<>();

	}

	public boolean gerenciarEstoque (int opcaoMenuEscolhida, Atendente atendente) {
		
		switch (opcaoMenuEscolhida) {
		
		case 1->{ 
			
			String nome = atendente.cadastrarNome();
			double preco = atendente.cadastrarPreco();
			int quantidade =atendente.cadastrarQuantidade();
			
			 Fruta fruta = new Fruta(nome, preco, quantidade);
			 estoqueFruta.add(fruta);
			
			}
		
		case 2->{
			
			for (Fruta novaFruta : estoqueFruta) {
				atendente.listarFruta(novaFruta);
			}
			
			
		}
		case 3->{
		for (int i = 0; i < estoqueFruta.size();) {		 
			
			 for (Fruta novaFruta : estoqueFruta) {
				 atendente.listarFruta(novaFruta);
				 i++;
			 }
			
		}
		
			 
		int opcaoEscolhida = atendente.escolhaRemoverProduto();
		estoqueFruta.remove(opcaoEscolhida);
		
			 
		 }
		
			
		
		case 0->{
			
		
		if (opcaoMenuEscolhida == 0) {
			
		return false;
		}
		}
		}
		
		return true;
	}

	public List<Fruta> getEstoqueFruta() {
		return estoqueFruta;
	}

	public void setEstoqueFruta(List<Fruta> estoqueFruta) {
		this.estoqueFruta = estoqueFruta;
	}
}
