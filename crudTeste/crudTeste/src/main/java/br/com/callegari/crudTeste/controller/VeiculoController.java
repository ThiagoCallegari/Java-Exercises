package br.com.callegari.crudTeste.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.callegari.crudTeste.bd.BDVeiculo;
import br.com.callegari.crudTeste.model.Veiculo;

@RestController
public class VeiculoController {

	private BDVeiculo bdv = new BDVeiculo();

	// Post
	@PostMapping("/veiculo/novo")
	public ResponseEntity<Veiculo> novoVeiculo(@RequestBody Veiculo veiculo) {
		bdv.gravar(veiculo);
		return ResponseEntity.ok(veiculo);
	}

	// Get id
	@GetMapping("/veiculo/{id}")
	public ResponseEntity<Veiculo> getVeiculo(@PathVariable int id) {
		Veiculo v = bdv.buscar(id);
		if (v != null) {
			return ResponseEntity.ok(v);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	// Get todos
	@GetMapping("/veiculo/todos")
	public ResponseEntity<ArrayList<Veiculo>> getTodos() {
		return ResponseEntity.ok(bdv.buscarTodos()); // vai retornar todos os veículos da lista
	}

	// Put Atualizar
	@PutMapping("/veiculo")
	public ResponseEntity<String> alteraVeiculo(@RequestBody Veiculo veiculo) {
		bdv.atualizar(veiculo);
		return ResponseEntity.ok("Success");
	}

	// Delete
	@DeleteMapping("/veiculo/delete/{id}")
	public ResponseEntity<String> removeVeiculo(@PathVariable int id) {
		if (bdv.apagar(id)) {
			return ResponseEntity.ok("DELETED");
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
