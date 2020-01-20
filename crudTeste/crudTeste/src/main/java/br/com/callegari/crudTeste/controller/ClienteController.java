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

import br.com.callegari.crudTeste.bd.BDCliente;
import br.com.callegari.crudTeste.model.Cliente;

@RestController
public class ClienteController {

	private BDCliente bd = new BDCliente(); // Criei meu banco de dados.

	@PostMapping("/cliente/novo")
	public ResponseEntity<Cliente> novoCliente(@RequestBody Cliente cliente) {
		bd.gravar(cliente);
		return ResponseEntity.ok(cliente);
	}

	@GetMapping("/cliente/{id}")
	public ResponseEntity<Cliente> getCliente(@PathVariable int id) {
		Cliente cli = bd.buscar(id);
		if (cli != null) {
			return ResponseEntity.ok(cli);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/cliente/todos")
	public ResponseEntity<ArrayList<Cliente>> getTodos() {
		return ResponseEntity.ok(bd.buscarTodos()); // vai retornar todos os clientes da lista
	}

	@PutMapping("/cliente")
	public ResponseEntity<String> alteraCliente(@RequestBody Cliente cliente) {
		bd.atualizar(cliente);
		return ResponseEntity.ok("Success");
	}

	@DeleteMapping("/cliente/delete/{id}")
	public ResponseEntity<String> removeCliente(@PathVariable int id) {
		if (bd.apagar(id)) {
			return ResponseEntity.ok("DELETED");
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
