package com.cod3r.gerenciadorfuncionarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
public class GerenciadorFuncionariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(GerenciadorFuncionariosApplication.class, args);
	}

}
