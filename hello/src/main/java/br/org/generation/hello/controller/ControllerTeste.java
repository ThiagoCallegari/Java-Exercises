package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Significa agora que esta classe será usada mediante URL
public class ControllerTeste {

	@GetMapping("/hello") 
	public String sayHello() {
		return "Hello World! My first Spring Boot project";
	}
	
	@GetMapping("/bye")
	public String sayGoodBye() {
		return "Good bye Baby!";
	}
	
}
