package com.generatio.blogpessoal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world3")
public class primeirocodigo {

	@GetMapping
	public String primeirocodigo () {
		return "Hello World!!!";
	}
	
	@GetMapping ("/bsms-genn")
	public String bsmsgen () {
		return "BSM´S GENERATION: "
				+ "Aprender tudo " + "me focar" + " me concentrar";
	
	}
	
	
}
