package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationController {
	@GetMapping("/listar")
	
	public String metodo(){
		return "api ok!";
	}

}
