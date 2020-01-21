package br.com.callegari.tokenLogin.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.callegari.tokenLogin.model.Produto;
import br.com.callegari.tokenLogin.security.Autenticator;

@RestController
@CrossOrigin("*")
public class ProdutoController {

	@GetMapping("/produto/todos")
	public ResponseEntity<ArrayList<Produto>> getAllAlunos(@RequestParam String token){
		if (Autenticator.isValid(token)) {
			/* este trecho é simulando uma consulta ao banco de dados */
			ArrayList<Produto> lista = new ArrayList<Produto>();
			for (int i=0;i<20;i++) {
				Produto p = new Produto();
				p.setCodigo(11);
				p.setTitulo("Nintendo Switch");
				p.setDetalhes("Turquesa");
				p.setPreco(1300.00);
				
				lista.add(p);
			}
			return ResponseEntity.ok(lista);
		}
		else {
			return ResponseEntity.status(403).build();
		}
		
	}
	
}
