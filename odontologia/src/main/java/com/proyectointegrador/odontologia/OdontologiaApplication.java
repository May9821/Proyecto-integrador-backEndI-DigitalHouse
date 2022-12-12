package com.proyectointegrador.odontologia;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OdontologiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdontologiaApplication.class, args);
		PropertyConfigurator.configure("log4j.properties");
	}

}
