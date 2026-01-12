package com.hibernate.ferreteria;

import com.hibernate.ferreteria.entity.Articulos;
import com.hibernate.ferreteria.repositorios.Repo_Articulos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FerreteriaApplication implements CommandLineRunner {

	@Autowired
	private Repo_Articulos repo;

	public static void main(String[] args) {
		SpringApplication.run(FerreteriaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Aplicacion iniciada correctamente");
		List<Articulos> articulos = repo.findAll();
		articulos.stream().forEach(articulos1 -> System.out.println(articulos1.toString()));
	}
}
