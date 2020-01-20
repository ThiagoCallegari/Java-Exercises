package br.com.callegari.crudTeste.bd;

import java.util.ArrayList;

import br.com.callegari.crudTeste.model.Veiculo;

public class BDVeiculo {

	private ArrayList<Veiculo> lista;

	public BDVeiculo() {
		lista = new ArrayList<Veiculo>();
	}

	// Create
	public void gravar(Veiculo v) {
		this.lista.add(v);
	}

	// Read
	public Veiculo buscar(int id) {
		Veiculo v = null;

		for (Veiculo vei : lista) {
			if (vei.getId() == id) {
				v = vei;
				break;
			}
		}

		return v;
	}

	// Update
	public void atualizar(Veiculo v) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == v.getId()) {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0) {
			lista.set(posicao, v);
		}
	}

	// Delete
	public boolean apagar(int id) {
		int posicao = -1;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getId() == id) {
				posicao = i;
				break;
			}
		}
		if (posicao >= 0) {
			lista.remove(posicao);
			return true;
		}
		return false;
	}

	//Busca todos
	public ArrayList<Veiculo> buscarTodos() {
		return lista;
	}
}
