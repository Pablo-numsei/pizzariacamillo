package com.itb.inf2gm.pizzariacamillo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzariacamilloApplication {

	public static void main(String[] args) {


		SpringApplication.run(PizzariacamilloApplication.class, args);

        System.out.println("Pizzaria camillo Rodando na porta 8080 ");
	}

}
