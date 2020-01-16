package br.com.callegari.home.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.callegari.home.model.Product;
import br.com.callegari.home.model.Usuary;

@RestController
public class ControllerTest {

	
	@GetMapping("/hello")
	public String hello() {
		return "Bem vindo a Callegari Web!";
	}
	
	@GetMapping("/product")
	public Product productData() {
		Product prod = new Product(1, "Merendeira", "Merendeira ê ê", 25, 30, "merendeira.jpeg");
		
		return prod;
	}
	
	@GetMapping("/usuary")
	public Usuary usuaryData() {
		Usuary use = new Usuary(1, "Ana", "ana@ana.com", "Ana Beatriz", "1234", 1);
		
		return use;
	}
}
