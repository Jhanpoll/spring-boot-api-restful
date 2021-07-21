package com.fundamentosspringboot.fundamentos;

import com.fundamentosspringboot.fundamentos.component.Component;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private Component component;

	public FundamentosApplication(@Qualifier("componentTwo") Component component) {
		this.component= component;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		component.leer();
	}
}
