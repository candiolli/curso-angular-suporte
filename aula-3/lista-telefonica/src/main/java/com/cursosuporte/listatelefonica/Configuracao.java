package com.cursosuporte.listatelefonica;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
//@Controller
public class Configuracao {

	public static void main(String[] args) {
		SpringApplication.run(Configuracao.class, args);
	}
	
	@RequestMapping(value = "/**", method = RequestMethod.GET)
	public String indexPage(){
	    System.out.println("I be in here too");

	    return "index";
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://127.0.0.1:5432/treinamento");
		ds.setUsername("postgres");
		ds.setPassword("123456");
		return ds;
	}
	
}
